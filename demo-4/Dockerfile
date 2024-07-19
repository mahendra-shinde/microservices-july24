FROM openjdk:17-jdk-buster as base
WORKDIR /app
COPY target/demo-4-1.0.jar /app/demo-4.jar
ENTRYPOINT ["java", "-jar", "/app/demo-4.jar"]