package org.tayssir.kafkademo.messaging.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class KafkaConsumer {
    @KafkaListener(topics = "testes", groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(String.format("Consuming the message from testes:: %s", msg));

    }
}
