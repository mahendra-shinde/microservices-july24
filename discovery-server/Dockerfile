FROM openjdk:17-jdk-buster as base
WORKDIR /app
COPY target/discovery-server-1.0.jar /app/discovery-server.jar
ENTRYPOINT ["java", "-jar", "/app/discovery-server.jar"]