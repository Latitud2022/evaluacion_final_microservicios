FROM openjdk:8-jdk-alpine
#FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8086
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} reelsRedSocial-1.0.jar
ENTRYPOINT ["java","-jar","/reelsRedSocial-1.0.jar"]
#