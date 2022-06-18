FROM openjdk:11
COPY build/libs/user-service-0.1.jar user-service.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "user-service.jar"]