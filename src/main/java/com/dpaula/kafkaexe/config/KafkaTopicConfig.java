package com.dpaula.kafkaexe.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author Fernando de Lima on 05/08/22
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic dpaulaTopic() {
        return TopicBuilder.name("dpaula-topic")
                .build();
    }
}
