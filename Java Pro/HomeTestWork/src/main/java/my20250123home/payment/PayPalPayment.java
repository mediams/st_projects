package my20250123home.payment;

public class PayPal implements PaymentStrategy {
    @Override
    public void pay(String paymentMethod, double amount) {
        System.out.println("Оплата " + amount + " через PayPal.");
    }
}
