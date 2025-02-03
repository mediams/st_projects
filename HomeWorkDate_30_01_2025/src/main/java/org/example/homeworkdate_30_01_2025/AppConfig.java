package org.example.homeworkdate_30_01_2025;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

//@Configuration
//@ComponentScan("org.example.homeworkdate_30_01_2025")
public class AppConfig {

    @Bean("visa")
    public Order orderVisa() {
//        Order order = new Order();
//        order.setItem("VISA");
//        order.setPrice(BigDecimal.valueOf(2.0));
//        return orderVisa();
        return new Order("VISA", BigDecimal.valueOf(2.0));
    }

    @Bean("paypal")
    public Order orderPaypal() {
//        Order order = new Order();
//        order.setItem("PayPal");
//        order.setPrice(BigDecimal.valueOf(1.0));
//        return orderVisa();
        return new Order("PayPal", BigDecimal.valueOf(1.0));
    }

    @Bean("orderPayPal")
    public PaymentGateway PaymentGatewayVisa() {
//        PaymentGateway paymentGateway = new PaymentGateway();
//        paymentGateway.setOrder(orderPaypal());
//        return paymentGateway;
        return new PaymentGateway(orderPaypal());
    }

    @Bean("orderVisa")
    public PaymentGateway PaymentGatewayPayPal() {
//        PaymentGateway paymentGateway = new PaymentGateway();
//        paymentGateway.setOrder(orderVisa());
//        return paymentGateway;
        return new PaymentGateway(orderVisa());
    }
}
