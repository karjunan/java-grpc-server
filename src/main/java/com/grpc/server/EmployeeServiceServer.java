package com.grpc.server;

import com.grpc.server.consumer.EmployeeConsumer;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class EmployeeServiceServer {
    public static void main(String[] args) {
        try {
            EmployeeServiceServer employeeServiceServer = new EmployeeServiceServer();
            employeeServiceServer.start();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    private Server server;
    
    private void start() throws Exception {
        final int port = 9000;
        EmployeeConsumer consumer = new EmployeeConsumer();

        server = ServerBuilder.forPort(port)
                .addService(consumer)
                .build()
                .start();

        System.out.println("Listening on port " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("Shutting down server");
                EmployeeServiceServer.this.stop();
            }
        });
        
        server.awaitTermination();
        
    }
    
    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }
}
