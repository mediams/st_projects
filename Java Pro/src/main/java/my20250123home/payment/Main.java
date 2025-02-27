package my20250123home.payment;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        System.out.println(paymentProcessor.pay("PayPal", 100.0));
        System.out.println(paymentProcessor.pay("CreditCart", 100.0));
        System.out.println(paymentProcessor.pay("CreditCard", 100.0));
    }
}
