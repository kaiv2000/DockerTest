FROM openjdk:17-alpine
COPY target/HelloApp-0.0.1-SNAPSHOT.jar hello.jar
ENTRYPOINT ["java","-jar","hello.jar"]