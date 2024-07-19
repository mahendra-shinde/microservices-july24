FROM openjdk:17-jdk-buster as base
WORKDIR /app
COPY target/gateway-1.0.jar /app/gateway.jar
ENTRYPOINT ["java", "-jar", "/app/gateway.jar"]