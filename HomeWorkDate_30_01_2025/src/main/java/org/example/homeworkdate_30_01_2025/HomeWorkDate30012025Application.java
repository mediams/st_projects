package org.example.homeworkdate_30_01_2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HomeWorkDate30012025Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HomeWorkDate30012025Application.class, args);
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Order laptop = context.getBean("laptop", Order.class);
//        System.out.println(laptop);

//        Order pc = context.getBean("pc", Order.class);
//        System.out.println(pc);

        PaymentGateway orderPaypal = context.getBean("laptop", PaymentGateway.class);
        System.out.println(orderPaypal);

        PaymentGateway orderVisa = context.getBean("pc", PaymentGateway.class);
        System.out.println(orderVisa);
    }

}
