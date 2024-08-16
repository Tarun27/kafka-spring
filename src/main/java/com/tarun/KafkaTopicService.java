package com.tarun;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class KafkaTopicService {

    private final KafkaAdmin kafkaAdmin;

    public KafkaTopicService(KafkaAdmin kafkaAdmin) {
        this.kafkaAdmin = kafkaAdmin;
    }

    @PostConstruct
    public void createTopic() {
        NewTopic newTopic = new NewTopic("my-topic", 1, (short) 1);
        kafkaAdmin.createOrModifyTopics(newTopic);
    }
}

