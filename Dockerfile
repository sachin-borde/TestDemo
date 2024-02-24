FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
EXPOSE 8090
COPY target/spring-boot-hello-world-example-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","/spring-boot-hello-world-example-0.0.1-SNAPSHOT.jar"]
