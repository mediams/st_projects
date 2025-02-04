package com.example.demospringex.service;

import org.springframework.stereotype.Service;

@Service("smsNotificationService")
public class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Отправка SMS-уведомления");
    }
}
