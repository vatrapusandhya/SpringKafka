package com.example.springKafka.SpringKafka.Producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CustomerProducer {

    public CustomerProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private KafkaTemplate<String, String> kafkaTemplate ;

    public void sendMessage(String msg){
        kafkaTemplate.send("CustomerTopic",msg);
    }

}
