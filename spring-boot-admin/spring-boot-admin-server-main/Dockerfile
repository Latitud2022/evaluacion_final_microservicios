#Arranque Spring Boot Admin
FROM openjdk:8-jdk-alpine
#FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8085
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-admin-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-boot-admin-server-0.0.1-SNAPSHOT.jar"]
#