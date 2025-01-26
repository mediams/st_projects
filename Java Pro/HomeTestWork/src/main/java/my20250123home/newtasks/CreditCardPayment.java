package my20250123home.newtasks;

public class CreditCardPayment implements PaymentProcessorStrategy {
    @Override
    public void processPayment(String type, double amount) {
        System.out.println("Processing credit card payment");
    }
}
