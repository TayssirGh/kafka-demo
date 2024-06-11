package org.tayssir.kafkademo.messaging.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate<String,String> kafkaTemplate;

    public void publishMessage(String msg){
        log.info(String.format("sending message to testes:: %s", msg));
        kafkaTemplate.send("testes", msg);

    }
}
