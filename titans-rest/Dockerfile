#
# Build stage
#
FROM maven:3.8.2-jdk-20 AS build
COPY . .
RUN mvn clean package

#
# Package stage
#
FROM openjdk:11-jdk-slim
COPY --from=build /target/titans-rest-0.0.1-SNAPSHOT.jar titans-rest.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","titans-rest.jar"]