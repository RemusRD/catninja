#Image that we are using
FROM openjdk:latest
ADD target/catninja-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
