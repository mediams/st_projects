package my20250123home.payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentProcessor {
    private static final Map<String, PaymentStrategy> strategies = new HashMap<>();

    static {
        strategies.put("CreditCard", new CreditCardPayment());
        strategies.put("PayPal", new PayPalPayment());
    }

    public double pay(String paymentMethod, double amount) {

        strategies.getOrDefault(paymentMethod, amount1 -> System.out.println("Неверный метод оплаты.")).pay(amount);
        return 0.0;
    }
}
