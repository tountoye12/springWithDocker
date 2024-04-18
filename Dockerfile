FROM openjdk:17-jdk-alpine

MAINTAINER diallo
COPY target/SpringBootWithDocker-0.0.1-SNAPSHOT.jar SpringBootWithDocker-1.0.0.jar
ENTRYPOINT ["java", "-jar", "SpringBootWithDocker-1.0.0.jar"]
