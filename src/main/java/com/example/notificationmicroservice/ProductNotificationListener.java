package com.example.notificationmicroservice;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ProductNotificationListener {

    @RabbitListener(queues = "#{ProductQueue.name}")
    public void listen(String message) {
        System.out.println("Product added: " + message);
    }

}
