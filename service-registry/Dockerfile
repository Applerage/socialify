FROM openjdk:11
COPY build/libs/service-registry-0.1.jar service-registry.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "service-registry.jar"]