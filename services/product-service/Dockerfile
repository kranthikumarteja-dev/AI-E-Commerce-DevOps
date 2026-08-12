FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/product-service-1.0.0.jar app.jar

EXPOSE 8082

USER 10001

ENTRYPOINT ["java", "-jar", "app.jar"]
