package my20250125home.ocprinciple;

public class VIPDiscount implements DiscountServiceStrategy{
    @Override
    public double calculateDiscount(String customerType, double amount) {
        return amount * 0.10; // 10% скидка для VIP
    }
}
