FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copy the built jar
COPY build/libs/*.jar app.jar

# Expose app port
EXPOSE 8080

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]