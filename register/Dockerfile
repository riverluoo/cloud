#下载java8的镜像
FROM java:8
#将本地文件挂到到/tmp目录
VOLUME /tmp
#复制文件到容器
ADD target/register.jar /register.jar
#暴露8888端口
EXPOSE 8888
#配置启动容器后执行的命令
ENTRYPOINT ["java","-jar","/register.jar"]