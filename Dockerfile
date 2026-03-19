FROM eclipse-temurin:21
WORKDIR /app
COPY target/*.jar demo-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-app.jar"]



