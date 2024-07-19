FROM openjdk:17-jdk-buster as base
WORKDIR /app
COPY target/demo-5-1.0.jar /app/demo-5.jar
ENTRYPOINT ["java", "-jar", "/app/demo-5.jar"]