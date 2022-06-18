FROM openjdk:11
COPY build/libs/song-service-0.1.jar song-service.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "song-service.jar"]