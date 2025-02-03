package org.example.homeworkdate_30_01_2025;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class PaymentGateway {
    @Autowired
    private Order order;


    @Override
    public String toString() {
        return "ordering " + this.order.getItem() + " | price: " + this.order.getPrice();
    }

}