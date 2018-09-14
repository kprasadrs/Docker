FROM openjdk:latest
LABEL maintainer="kprasadrs@gmail.com"
VOLUME /tmp
EXPOSE 8080
ARG PROJECT_JAR_FILE=target/helloaustralia-0.0.1-SNAPSHOT.jar 
ADD ${PROJECT_JAR_FILE} spring_docker_hello_australia.jar
# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring_docker_hello_australia.jar"]
