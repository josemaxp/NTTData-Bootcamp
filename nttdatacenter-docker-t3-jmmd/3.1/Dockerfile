FROM ubuntu

RUN apt-get update
RUN apt-get upgrade

RUN apt-get -y install maven

RUN apt-get -y install default-jdk

RUN mkdir /app

WORKDIR /app
COPY nttdatatallermvn-JMMD /app

CMD ["java", "../app/src/main/java/com/nttdata/mvn/App.java"]