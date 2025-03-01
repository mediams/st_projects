package my20250123home.payment;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay( double amount) {
        System.out.println("Оплата " + (amount  + 10.0) + " кредитной картой.");
    }


}
