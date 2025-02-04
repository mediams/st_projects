package com.example.demospringex;

import com.example.demospringex.service.MessagePrinter;
import com.example.demospringex.service.NotificationManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAutowiredEx {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoAutowiredEx.class, args);

        MessagePrinter bean = context.getBean(MessagePrinter.class);
        bean.printMessage();

        NotificationManager sendMessage = context.getBean(NotificationManager.class);
        sendMessage.sendEmail();
        sendMessage.sendSms();
        sendMessage.getNotifications();
    }
}
