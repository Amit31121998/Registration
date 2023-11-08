FROM openjdk:11

COPY target/docker-app.jar  usr/app/

WORKDIR /usr/app

EXPOSE 9090

ENTRYPOINT [ "java","-jar","docker-app.jar" ]