#
# Build stage
#
FROM jelastic/maven:3.8.6-openjdk-20.ea-b24 AS build
COPY . .
RUN mvn clean package

#
# Package stage
#
FROM openjdk:20.ea-b24
COPY --from=build /target/titans-rest-0.0.1-SNAPSHOT.jar titans-rest.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","titans-rest.jar"]