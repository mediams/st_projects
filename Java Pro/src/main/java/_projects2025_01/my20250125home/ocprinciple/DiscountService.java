package my20250125home.ocprinciple;

import java.util.Arrays;

public class DiscountService implements DiscountServiceStrategy {
    private DiscountServiceStrategy discountServiceStrategy;

    public DiscountService(DiscountServiceStrategy discountServiceStrategy) {
        this.discountServiceStrategy = discountServiceStrategy;
    }

    //    @Override
    public double calculateDiscount(String customerType, double amount) {
        return discountServiceStrategy.calculateDiscount(customerType, amount);

    }
}