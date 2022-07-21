FROM openjdk:11
ARG JAR_FILE=build/libs/posqr-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} posqr.jar
ENTRYPOINT ["java", "-jar", "/posqr.jar"]