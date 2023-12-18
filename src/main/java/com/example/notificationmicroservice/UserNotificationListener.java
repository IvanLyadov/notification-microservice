package com.example.notificationmicroservice;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class UserNotificationListener {

    @RabbitListener(queues = "#{UserQueue.name}")
    public void listen(String message) {
        System.out.println("User added: " + message);
    }

}
