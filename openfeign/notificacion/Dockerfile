#openfeign
#FROM openjdk:8-jdk-alpine
FROM adoptopenjdk:11-jre-hotspot
#EXPOSE 8093
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} notificacion-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/notificacion-0.0.1-SNAPSHOT.jar"]
