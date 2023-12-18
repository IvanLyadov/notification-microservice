package com.example.notificationmicroservice;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NotificationMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationMicroserviceApplication.class, args);
	}


	@Bean
	Queue UserQueue() {
		return new Queue("UserQueue", true);
	}

	@Bean
	Queue ProductQueue() {
		return new Queue("PostQueue", true);
	}

}
