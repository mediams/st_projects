package my20250123home.payment;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " через PayPal.");
    }
}
