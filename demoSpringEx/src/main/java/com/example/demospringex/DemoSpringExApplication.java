package com.example.demospringex;

import com.example.demospringex.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication
public class DemoSpringExApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoSpringExApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);
    }

}
