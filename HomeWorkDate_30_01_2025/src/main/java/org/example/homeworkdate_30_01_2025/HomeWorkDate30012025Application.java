package org.example.homeworkdate_30_01_2025;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HomeWorkDate30012025Application {

    public static void main(String[] args) {
//        SpringApplication.run(HomeWorkDate30012025Application.class, args);
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Order visa = context.getBean(Order.class);
        System.out.println(visa);

//        Order paypal = context.getBean("paypal", Order.class);
//        System.out.println(paypal);
//
//        PaymentGateway orderPaypal = context.getBean("orderPayPal", PaymentGateway.class);
//        System.out.println(orderPaypal);
//
//        PaymentGateway orderVisa = context.getBean("orderVisa", PaymentGateway.class);
//        System.out.println(orderVisa);


    }

}
