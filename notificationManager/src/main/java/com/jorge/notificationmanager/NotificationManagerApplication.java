package com.jorge.notificationmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NotificationManagerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(NotificationManagerApplication.class, args);
        var manager = context.getBean(NotificationManager.class);
        manager.sendMessage("Hello, how are you today?");
    }

}
