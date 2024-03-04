FROM gradle:jdk17 AS build

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle --no-daemon bootJar

##########

FROM openjdk:17

EXPOSE 8080

RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app.jar
CMD java -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -jar /app.jar
