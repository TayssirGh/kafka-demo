package org.tayssir.kafkademo.messaging.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.tayssir.kafkademo.messaging.payload.Employee;

@Slf4j
@Component
public class KafkaConsumer {
//    @KafkaListener(topics = "testes", groupId = "myGroup")
//    public void consumeMsg(String msg){
//        log.info(String.format("Consuming the message from testes:: %s", msg));
//
//    }
    @KafkaListener(topics = "testes", groupId = "myGroup")
    public void consumeMsg(Employee employee){
        log.info(String.format("Consuming the message from testes:: %s", employee.toString()));

    }
}
