//package com.javatechie.reactive.kafka;
//
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.network.Send;
//import org.apache.kafka.common.serialization.IntegerDeserializer;
//import org.apache.kafka.common.serialization.IntegerSerializer;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import reactor.kafka.receiver.KafkaReceiver;
//import reactor.kafka.receiver.ReceiverOptions;
//import reactor.kafka.sender.KafkaSender;
//import reactor.kafka.sender.SenderOptions;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class KafkaReactorConsumerConfig {
//
//    @Value(value = "http://localhost:9092")
//    private String bootstrapserver;
//
//
//
////    @Bean
////    public SenderOptions<Integer,String> senderOptions(){
////        Map<String,Object> producerProps = new HashMap<>();
////        producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapserver);
////        producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
////        producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
////        return SenderOptions.<Integer,String>create(producerProps).maxInFlight(1024);
////    }
//
////    @Bean
////    public KafkaSender<Integer,String> kafkaSender(){return KafkaSender.create(senderOptions());}
//
//    @Bean
//    public ReceiverOptions<Integer,String> receiverOptions(){
//        Map<String,Object> consumerProps = new HashMap<>();
//        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapserver);
//        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG,"here");
//        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);
//        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"latest");
//        consumerProps.put(ConsumerConfig.CLIENT_ID_CONFIG, "dss-1");
//        return ReceiverOptions.<Integer,String>create(consumerProps)
//                .subscription(Collections.singleton("feedback"));
//    }
//
//
//    @Bean
//    KafkaReceiver<Integer,String> kafkaReceiver(){return KafkaReceiver.create(receiverOptions());}
//
//
//}
