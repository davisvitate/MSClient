FROM openjdk:8
VOLUME /tmp
EXPOSE 8805
ADD ./target/Clients-0.0.1-SNAPSHOT.jar client-server.jar
ENTRYPOINT ["java","-jar","/client-server.jar"]