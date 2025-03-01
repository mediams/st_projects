package my20250123home;

public class OCPrinciple_falsche {
    class DiscountCalculator {
        public double calculateDiscount(String customerType, double price) {
            if (customerType.equals("Regular")) {
                return price * 0.1;
// 10% скидка
            } else if (customerType.equals("VIP")) {
                return price * 0.2;
// 20% скидка
            }
            return 0;
        }
    }
}
