# 基础镜像使用java
FROM openjdk:8-jdk-alpine
ADD *.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
