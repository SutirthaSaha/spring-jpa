FROM openjdk:8
EXPOSE 8081
ADD target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]