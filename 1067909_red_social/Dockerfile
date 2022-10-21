FROM openjdk:8-jdk-alpine
#FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8081
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} eduardo-oscar-alfonzo-montesdeoca-redsocialapi.jar
ENTRYPOINT ["java","-jar","/eduardo-oscar-alfonzo-montesdeoca-redsocialapi.jar"]

