package my20250123home.newtasks;

class PaymentProcessor {
    private PaymentProcessorStrategy strategy;

    public void setStrategy(PaymentProcessorStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(String type, double amount) {
        strategy.processPayment(type, amount);
    }
}

