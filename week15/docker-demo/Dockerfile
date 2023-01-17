# openjdk:8-jdk-alpine is deprecated, so use eclipse-temurin instead
# base image
FROM eclipse-temurin:8-jdk-alpine

# grab the jar file in target
ARG JAR_FILE=target/*.jar

# rename it as "app.jar"
COPY ${JAR_FILE} app.jar

# what happens when we run the docker container
# java -jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]