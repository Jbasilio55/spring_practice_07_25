package com.jorge.notificationmanager;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("sending sms: "+message);
    }
}
