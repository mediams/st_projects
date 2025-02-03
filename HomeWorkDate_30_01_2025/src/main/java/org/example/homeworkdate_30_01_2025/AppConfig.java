package org.example.homeworkdate_30_01_2025;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.homeworkdate_30_01_2025")
public class AppConfig {
//
    @Bean("laptop")
    public Order laptop() {
//        Order order = new Order();
//        order.setItem("Laptop 'McBook'");
//        order.setPrice(1500);
//        return order;
        return new Order("Laptop 'McBook'", 1500);
    }
//
    @Bean("pc")
    public Order pc() {
//        Order order = new Order();
//        order.setItem("PC 'Booster'");
//        order.setPrice(2500);
//        return order;
        return new Order("PC 'Booster'", 2500);
    }
//
//    @Bean("orderPayPal")
//    public PaymentGateway PaymentGatewayVisa() {
////        PaymentGateway paymentGateway = new PaymentGateway();
////        paymentGateway.setOrder(orderPaypal());
////        return paymentGateway;
//        return new PaymentGateway(pc());
//    }
//
//    @Bean("orderVisa")
//    public PaymentGateway PaymentGatewayPayPal() {
////        PaymentGateway paymentGateway = new PaymentGateway();
////        paymentGateway.setOrder(orderVisa());
////        return paymentGateway;
//        return new PaymentGateway(laptop());
//    }
}
