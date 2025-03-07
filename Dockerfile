FROM  amazoncorretto:22.0.0-al2023
WORKDIR /app

COPY SpringSample-0.0.1-SNAPSHOT.jar /app/app.jar
# Set the entry point for running the application
ENTRYPOINT ["java","-jar","app.jar","--server.port=80"]
