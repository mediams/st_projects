package org.example.homeworkdate_30_01_2025;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentGateway {
    private Order order;


    @Override
    public String toString() {
        return "ordering " + this.order.getItem() + " | price: " + this.order.getPrice();
    }

}