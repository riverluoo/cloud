FROM java:8
VOLUME /tmp
ADD target/config.jar /config.jar
EXPOSE 8101
ENTRYPOINT ["java","-jar","/config.jar"]