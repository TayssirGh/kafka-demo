package org.tayssir.kafkademo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tayssir.kafkademo.messaging.payload.Employee;
import org.tayssir.kafkademo.messaging.producer.KafkaJsonProducer;
import org.tayssir.kafkademo.messaging.producer.KafkaProducer;

@RestController
@RequestMapping("/api/tsts/messages")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducer producer;
    private final KafkaJsonProducer jsonProducer;
    @PostMapping("/string")
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        producer.publishMessage(message);
        return ResponseEntity.ok("Message queued successfully");
    }
    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Employee message){
        jsonProducer.publishMessage(message);
        return ResponseEntity.ok("Message queued successfully as JSON");
    }
}
