FROM eclipse-temurin:21.0.12.1_1-jre-ubi9-minimal
LABEL maintainer = "K V MANOJ KUMAR"
WORKDIR  /app
COPY target/*.jar app.jar
EXPOSE 8081
CMD ["java", "-jar", "app.jar"]
