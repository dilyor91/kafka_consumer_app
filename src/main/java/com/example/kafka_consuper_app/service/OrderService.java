package com.example.kafka_consuper_app.service;

import com.example.kafka_consuper_app.constants.AppConstants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @KafkaListener(topics = AppConstants.TOPIC, groupId = "dilyor-com")
    public void subscribeMsg(String order) {
        System.out.println("*** Msg Reseived From Kafka *** ::");
        System.out.println(order);
        // logic
    }
}
