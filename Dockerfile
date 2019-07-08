FROM openjdk
WORKDIR /usr/src/app
COPY grpc-kafka-server-1.0-SNAPSHOT-jar-with-dependencies.jar .
#ENV CLASSPATH java-grpc-server.jar;
EXPOSE 9000
RUN java -version
RUN ls -ltr
CMD java -jar grpc-kafka-server-1.0-SNAPSHOT-jar-with-dependencies.jar