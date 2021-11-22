FROM OPENJDK:8
ADD target/springboot-tech.jar springboot-tech.jar
EXPOSE 8085
ENTRYPOINT ["java" , "-jar", "springboot-tech.jar"]