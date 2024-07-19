FROM openjdk:17-jdk-buster as base
WORKDIR /app
COPY target/config-server-1.0.jar /app/config-server.jar
ENTRYPOINT ["java", "-jar", "/app/config-server.jar"]