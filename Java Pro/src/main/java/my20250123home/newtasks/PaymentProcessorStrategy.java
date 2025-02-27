package my20250123home.newtasks;

public interface PaymentProcessorStrategy {
    void processPayment(String type, double amount);
}
