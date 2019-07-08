package com.grpc.server.consumer;

import com.grpc.messages.EmployeeServiceGrpc;
import com.grpc.messages.Messages;
import com.messages.Employee;
import io.grpc.stub.StreamObserver;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;


public class EmployeeConsumer extends EmployeeServiceGrpc.EmployeeServiceImplBase {

    static final String NAME_TOPIC = "employee-topic-1";
    static final String MODIFIED_NAME_TOPIC = "stream-modified-name-producer-topic";
    static final String SERVERS = "localhost:9092,localhost:9093,localhost:9094";
    static Properties properties;
    private Queue<Employee> queue = new LinkedBlockingQueue<>();

    public  EmployeeConsumer() {
        properties = new Properties();
        properties.put(StreamsConfig.APPLICATION_ID_CONFIG, "name-read-example");
        properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, SERVERS);
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG,Serdes.String().getClass());
        Map<String, Object> serdeProps = new HashMap<>();

        final Serializer<Employee> employeeSerializer = new JsonPOJOSerializer<>();
        serdeProps.put("JsonPOJOClass", Employee.class);
        employeeSerializer.configure(serdeProps, false);

        final Deserializer<Employee> employeeDeSerializer = new JsonPOJODeserializer<>();
        serdeProps.put("JsonPOJOClass", Employee.class);
        employeeDeSerializer.configure(serdeProps, false);

        final Serde<Employee> employeeSerde = Serdes.serdeFrom(employeeSerializer, employeeDeSerializer);
//        properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,new JsonDeserializer());
        StreamsBuilder nameAgeBuilder = new StreamsBuilder();

        KStream<String, Employee> name = nameAgeBuilder.stream(NAME_TOPIC, Consumed.with(Serdes.String(),employeeSerde ));
        name.foreach((k,v) -> {
            System.out.println(v);
            queue.add(v);
        });

        KafkaStreams kafkaStreams = new KafkaStreams(nameAgeBuilder.build(), properties);
        kafkaStreams.start();
    }


    @Override
    public void getAll(Messages.GetAllRequest request,
                       StreamObserver<Messages.EmployeeResponse> responseObserver) {

        System.out.println("Received a message to start stream processing");
        System.out.println(queue);
        while(true) {
            queue.forEach(v-> {
                System.out.println(v);
                Messages.Employee emp = Messages.Employee.newBuilder()
                        .setId(v.getId())
                        .setFirstName(v.getFirstName())
                        .setLastName(v.getLastName())
                        .setBadgeNumber(v.getBadgeNumber())
                        .build();

               Messages.EmployeeResponse response = Messages.EmployeeResponse.newBuilder()
                        .setEmployee(emp)
                        .build();

                        responseObserver.onNext(response);
                        queue.poll();
            });
//            System.out.println("finished processing !! ");
        }

//        responseObserver.onCompleted();
    }



//    public KStream<String,String> startProcessing(KStream name) {
//
//        System.out.println("Starting Stream Processing !! ");

//        KTable<String, Long> table = name.mapValues(v -> v.toLowerCase())
//                .flatMapValues(values -> Arrays.asList(values.split(" ")))
//                .selectKey((key, value) -> value)
//                .groupByKey()
//                .count();

//        name.foreach((k, v) -> System.out.println("key " + k + " = " + v));
//        System.out.println(" table data created => " + table);
//        table.toStream().foreach((k, v) -> System.out.println(k + " - " + v));
//        table.toStream().to(MODIFIED_NAME_TOPIC, Produced.with(Serdes.String(), Serdes.Long()));

//        return name;
//    }

}
