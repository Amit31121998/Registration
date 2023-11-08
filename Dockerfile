FROM openjdk:11

COPY target/docker-app.war  usr/app/

WORKDIR /usr/app

EXPOSE 9090

ENTRYPOINT [ "java","-war","docker-app.war" ]