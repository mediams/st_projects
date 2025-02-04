package com.example.demospringex.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("emailNotificationService")
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Отправка email-уведомления");
    }
}
