package my20250125home.ocprinciple;

public class RegularDiscount implements DiscountServiceStrategy{
    @Override
    public double calculateDiscount(String customerType, double amount) {
        return amount * 0.05; // 5% скидка для обычного клиента
    }
}
