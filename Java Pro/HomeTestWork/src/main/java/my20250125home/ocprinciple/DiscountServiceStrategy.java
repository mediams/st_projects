package my20250125home.ocprinciple;

public interface DiscountServiceStrategy {
    double calculateDiscount(String customerType, double amount);
}
