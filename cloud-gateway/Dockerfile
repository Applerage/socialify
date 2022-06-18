FROM openjdk:11
COPY build/libs/cloud-gateway-0.1.jar cloud-gateway.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "cloud-gateway.jar"]