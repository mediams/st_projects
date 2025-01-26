package my20250123home.newtasks;

public class Main {
    public static void main(String[] args) {
        PaymentProcessorStrategy creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment("credit card", 100.0);

        PaymentProcessorStrategy payPalPayment = new PayPalPayment();
        payPalPayment.processPayment("PayPal", 100.0);

        PaymentProcessorStrategy anotherPayment = new PayPalPayment();
        payPalPayment.processPayment("PayPal1", 100.0);
    }
}
