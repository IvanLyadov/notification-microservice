## Notification Microservice
### Overview
The Notification Microservice is a Spring Boot-based application designed to handle notifications using RabbitMQ for asynchronous messaging. This documentation provides an overview of the project structure, configuration, and key components.

## Table of Contents

1. [Project Structure](#project-structure)

## Project Structure <a name="project-structure"></a>

```plaintext
notification-microservice/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/notificationmicroservice/
│   │   │       ├── NotificationMicroserviceApplication.java
│   │   │       ├── ProductNotificationListener.java
│   │   │       ├── UserNotificationListener.java
│   ├── resources/
│   │   └── application.yml
├── pom.xml
```

To run the application, run the following docker command:


```bash
docker run -d --hostname my-rabbit --name some-rabbit -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```
rabbit is available on ```http://localhost:15672``` (guest/guest)

Queues and Streams -> Add new queue
