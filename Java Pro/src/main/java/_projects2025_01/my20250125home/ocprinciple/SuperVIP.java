package my20250125home.ocprinciple;

public class SuperVIP implements DiscountServiceStrategy{
    @Override
    public double calculateDiscount(String customerType, double amount) {
        return amount * 0.15; // 15% скидка для SuperVIP
    }
}
