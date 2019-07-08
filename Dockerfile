FROM openjdk
WORKDIR /usr/src/app
COPY java-grpc-server.jar .
#ENV CLASSPATH .;java-grpc-server.jar;
EXPOSE 9000
CMD java -cp java-grpc-server.jar com.grpc.server.EmployeeServiceServer