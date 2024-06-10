package org.tayssir.kafkademo.messaging.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.tayssir.kafkademo.messaging.payload.Employee;
@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaJsonProducer {
    private final KafkaTemplate<String, Employee> kafkaTemplate;
    public void publishMessage(Employee employee){
        log.info(String.format("sending message to testes:: %s", employee));
        Message<Employee> msg = MessageBuilder.withPayload(employee).setHeader(KafkaHeaders.TOPIC, "testes").build() ;
        kafkaTemplate.send(msg);

    }
}
