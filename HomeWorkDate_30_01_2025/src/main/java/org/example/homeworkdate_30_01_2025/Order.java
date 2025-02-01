package org.example.homeworkdate_30_01_2025;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    private String item;
    private BigDecimal price;

    @Override
    public String toString() {
        return "Order{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}
