FROM openjdk:8
ADD target/docker-assignment.jar docker-assignment.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","docker-assignment.jar"]