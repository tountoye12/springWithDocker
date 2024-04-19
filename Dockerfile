FROM openjdk:17-jdk-alpine


MAINTAINER diallo
COPY target/SpringBootWithDocker-0.0.1-SNAPSHOT.jar SpringBootWithDocker-1.0.0.jar
ENTRYPOINT ["java", "-jar", "SpringBootWithDocker-1.0.0.jar"]

## Set metadata for the image
#LABEL maintainer="diallo"
#
## Copy the Spring Boot JAR file into the container
#COPY target/SpringBootWithDocker-0.0.1-SNAPSHOT.jar SpringBootWithDocker-1.0.0.jar
#
## Specify the entry point for the container
#ENTRYPOINT ["java", "-jar", "SpringBootWithDocker-1.0.0.jar"]








# Use an existing MySQL image as base
#FROM mysql:latest
#
## Environment variables for MySQL root password and database name
#ENV MYSQL_ROOT_PASSWORD=${MYSQL_ROOT_PASSWORD}
#ENV MYSQL_DATABASE=${MYSQL_DB}
#ENV MYSQL_ALLOW_EMPTY_PASSWORD = ${MYSQL_ALLOW_EMPTY_PASSWORD}
#ENV MYSQL_RANDOM_ROOT_PASSWORD = ${MYSQL_RANDOM_ROOT_PASSWORD}
#
#
## Expose port 3306 (default MySQL port)
#EXPOSE 3306:3306


# command docker build --tag=hello-world:latest .
# Run it
# docker run -p8887:8888 hello-world:latest



























