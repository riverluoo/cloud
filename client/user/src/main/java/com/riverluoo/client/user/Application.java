package com.riverluoo.client.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @auther: wangyang
 * @since: 2019-05-27 15:53
 */
@SpringCloudApplication
@MapperScan("com.riverluoo.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

