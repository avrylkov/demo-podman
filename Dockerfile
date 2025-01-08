FROM docker.io/openjdk:17-alpine
LABEL authors="av-rylkov"
COPY target/demo-podman-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]