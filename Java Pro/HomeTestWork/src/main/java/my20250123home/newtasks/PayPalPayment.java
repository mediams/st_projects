package my20250123home.newtasks;

public class PayPalPayment implements PaymentProcessorStrategy {
    @Override
    public void processPayment(String type, double amount) {
        System.out.println("Processing PayPal payment");
    }
}
