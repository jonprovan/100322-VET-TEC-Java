# select the base image 
# this is like the openjdk java 1.8 we put on our virtual machine yesterday
FROM eclipse-temurin:8-jdk-alpine

# grab the jar file in target
ARG JAR_FILE=target/*.jar

# rename it as "app.jar"
COPY ${JAR_FILE} app.jar

# what happens when we run the docker container
# java -jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]