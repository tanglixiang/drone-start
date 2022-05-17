# 基础镜像使用java
FROM openjdk:8-jdk-alpine
ADD *.jar turf-start-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","turf-start-1.0-SNAPSHOT.jar"]
