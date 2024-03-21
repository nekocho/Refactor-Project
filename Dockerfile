FROM openjdk:23
VOLUME /tmp
EXPOSE 8080
# ARG JAR_FILE=target/spring-boot-docker.jar
ADD target/refactor-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]