package org.example.homeworkdate_30_01_2025;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.homeworkdate_30_01_2025")
public class AppConfig {

//    @Bean("visa")
//    public Order orderVisa() {
//        Order order = new Order();
//        order.setItem("VISA");
//        order.setPrice(BigDecimal.valueOf(2.0));
//        return order;
//    }
//
//    @Bean("paypal")
//    public Order orderPaypal() {
//        Order order = new Order();
//        order.setItem("PayPal");
//        order.setPrice(BigDecimal.valueOf(1.0));
//        return order;
//    }
//
//    @Bean("orderPayPal")
//    public PaymentGateway PaymentGatewayVisa() {
//        PaymentGateway paymentGateway = new PaymentGateway();
//        paymentGateway.setOrder(orderPaypal());
//        return paymentGateway;
//    }
//
//    @Bean("orderVisa")
//    public PaymentGateway PaymentGatewayPayPal() {
//        PaymentGateway paymentGateway = new PaymentGateway();
//        paymentGateway.setOrder(orderVisa());
//        return paymentGateway;
//    }
}
