FROM openjdk:11-jdk
COPY ./target/user-service-0.0.1.jar user-service.jar
ENTRYPOINT ["java","-jar","-Djava.security.egd=file:./config/application.yml","user-service.jar"]
