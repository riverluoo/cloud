package com.riverluoo.client.user.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Profile({"dev", "test"})
@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(path -> !Objects.equals(path, "/error"))
                .build()
                .apiInfo(this.apiInfo());
        // .globalOperationParameters(this.tokenHeader());
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("user模块")
                .description("user模块")
                .version("1.0.0")
                .build();
    }

    private List<Parameter> tokenHeader() {
        Parameter token = new ParameterBuilder()
                .name("token")
                .description("token")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false).build();
        return Collections.singletonList(token);

    }
}
