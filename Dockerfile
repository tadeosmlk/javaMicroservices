FROM openjdk:18
ARG JAR_FILE=irsk8s/target/irsk8s-0.0.1-SNAPSHOT.jar 
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
