package org.example.homeworkdate_30_01_2025;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class AppConfig {

    @Bean("visa")
    public Order order() {
        Order order = new Order();
        order.setItem("VISA");
        order.setPrice(BigDecimal.valueOf(2.0));
        return order;
    }
}
