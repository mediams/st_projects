package com.example.demospringex.service;

import org.springframework.stereotype.Service;

@Service
public class PushNotificationService implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("Отправка Push-уведомления...");
    }
}
