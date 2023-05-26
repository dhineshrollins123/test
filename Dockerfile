FROM openjdk:11
WORKDIR /app
COPY /target/demo-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
CMD["java","-jar","/app/demo-0.0.1-SNAPSHOT.jar"]