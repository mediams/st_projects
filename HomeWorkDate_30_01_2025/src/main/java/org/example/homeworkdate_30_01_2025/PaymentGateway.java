package org.example.homeworkdate_30_01_2025;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class PaymentGateway {
    private final Order order;

    @Autowired
    public PaymentGateway(@Qualifier("laptop") Order order) { // Выбираем бин
        this.order = order;
    }

    @Override
    public String toString() {
        return "ordering " + this.order.getItem() + " | price: " + this.order.getPrice();
    }
}