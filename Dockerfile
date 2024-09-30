
FROM openjdk:17

COPY target/DockerDemo_JulyBatch-0.0.1-SNAPSHOT.jar app.jar

#java -jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]