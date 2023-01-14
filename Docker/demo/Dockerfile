#defining base image 
FROM openjdk:11
ADD target/spring-boot-docker-demo.jar spring-boot-docker-demo.jar
ENTRYPOINT [ "java","-jar","spring-boot-docker-demo.jar" ]