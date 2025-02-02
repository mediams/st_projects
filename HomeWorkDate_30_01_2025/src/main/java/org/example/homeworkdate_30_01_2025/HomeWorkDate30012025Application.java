package org.example.homeworkdate_30_01_2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HomeWorkDate30012025Application {

    public static void main(String[] args) {
//        SpringApplication.run(HomeWorkDate30012025Application.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Order visa = (Order)context.getBean("visa");
        System.out.println(visa);
        Order paypal = (Order)context.getBean("paypal");
        System.out.println(paypal);
        
        PaymentGateway order = (PaymentGateway)context.getBean("orderPayPal");
        System.out.println(order);

        PaymentGateway orderVisa = (PaymentGateway)context.getBean("orderVisa");
        System.out.println(orderVisa);


    }

}
