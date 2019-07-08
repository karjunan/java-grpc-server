package com.grpc.server.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.messages.Employee;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class EmployeeDeserializer implements Deserializer {
    @Override
    public void configure(Map map, boolean b) {

    }

    @Override
    public Object deserialize(String s, byte[] bytes) {
        ObjectMapper mapper = new ObjectMapper();
        Employee user = null;
        try {
            user = mapper.readValue(bytes, Employee.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void close() {

    }
}
