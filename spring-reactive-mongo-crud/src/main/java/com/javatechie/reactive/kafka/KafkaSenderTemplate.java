//package com.javatechie.reactive.kafka;
//
//
//import lombok.Value;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Service;
//import reactor.core.publisher.Flux;
//import reactor.kafka.sender.KafkaSender;
//import reactor.kafka.sender.SenderRecord;
//
//@Slf4j
//@Service
//public class KafkaSenderTemplate {
//
//    Flux<SenderRecord<Integer,String,Integer>> outboundFlux=
//            Flux.range(1,10)
//                    .map(i->SenderRecord.create("pool",1,System.currentTimeMillis(),i,"Message_"+i,i));
//
//
//
//
//
//
//}
