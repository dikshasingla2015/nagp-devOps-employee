FROM openjdk:8-jdk-alpine
ADD ./target/employee-0.0.1-SNAPSHOT.jar employee.jar

EXPOSE 3515
ENTRYPOINT ["java", "-jar", "/employee.jar"]