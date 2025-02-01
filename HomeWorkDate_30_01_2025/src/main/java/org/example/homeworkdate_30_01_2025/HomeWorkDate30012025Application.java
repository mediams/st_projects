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
        Object visa = context.getBean("visa");
        System.out.println(visa);
        Object paypal = context.getBean("paypal");
        System.out.println(paypal);
        Object order = context.getBean("orderPayPal");
        System.out.println(order);

        Object orderVisa = context.getBean("orderVisa");
        System.out.println(orderVisa);


    }

}
