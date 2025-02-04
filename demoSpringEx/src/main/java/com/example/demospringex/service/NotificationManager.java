package com.example.demospringex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
    private final NotificationService smsService;
    private final NotificationService emailService;

    @Autowired
    public NotificationManager(@Qualifier("smsNotificationService") NotificationService smsService,
                               @Qualifier("emailNotificationService") NotificationService emailService) {
        this.smsService = smsService;
        this.emailService = emailService;
    }

    public void sendSms() {
        smsService.sendNotification();
    }

    public void sendEmail() {
        emailService.sendNotification();
    }
}
