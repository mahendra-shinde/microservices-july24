FROM openjdk:17-jdk-buster as base
WORKDIR /app
COPY target/demo-3-1.0.jar /app/demo-3.jar
ENTRYPOINT ["java", "-jar", "/app/demo-3.jar"]