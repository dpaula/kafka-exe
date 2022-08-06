package com.dpaula.kafkaexe.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Fernando de Lima on 05/08/22
 */
@Component
public class KafkaListeners {

    @KafkaListener(topics = "dpaula-topic", groupId = "dpaula-group")
    public void listen(String message) {
        System.out.println("Received: " + message+ " from dpaula-topic");
    }
}
