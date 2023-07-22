FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

#Build da img do projeto
#docker build -t gabrielsantos1308/payment-service:1.0.0 .