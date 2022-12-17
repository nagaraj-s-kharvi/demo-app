FROM openjdk:8-jdk-alpine
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/demo-app-0.0.1-SNAPSHOT.jar demo-app-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar demo-app-0.0.1-SNAPSHOT.jar