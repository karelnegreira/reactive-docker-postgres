FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
ADD target/reactive-postgres-docker2.jar reactive-postgres-docker2.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/reactive-postgres-docker2.jar"]