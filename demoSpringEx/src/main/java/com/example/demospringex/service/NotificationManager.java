package com.example.demospringex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotificationManager {
    private final NotificationService smsService;
    private final NotificationService emailService;
    private final List<NotificationService> notifications;

    @Autowired
    public NotificationManager(@Qualifier("smsNotificationService") NotificationService smsService,
                               @Qualifier("emailNotificationService") NotificationService emailService,
                               List<NotificationService> notifications) {
        this.smsService = smsService;
        this.emailService = emailService;
        this.notifications = notifications;
    }

    public void sendSms() {
        smsService.sendNotification();
    }

    public void sendEmail() {
        emailService.sendNotification();
    }

    public List<NotificationService> getNotifications() {
        notifications.forEach(NotificationService::sendNotification);
        return notifications;
    }
}
