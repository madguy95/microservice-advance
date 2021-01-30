FROM openjdk:8-jdk-alpine
EXPOSE 8888
RUN apk add --update curl && \
    rm -rf /var/cache/apk/*
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]