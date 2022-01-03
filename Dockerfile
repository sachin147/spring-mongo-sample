FROM openjdk:8
COPY target/*.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/demo.jar"]