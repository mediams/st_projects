package _projects2025_01.my20250601home;

interface Discount {
    double calculate(double price);
}


// Реализация для обычного клиента
class RegularDiscount implements Discount {
    public double calculate(double price) {
        return price * 0.1;
// 10% скидка
    }
}


// Реализация для VIP клиента
class VIPDiscount implements Discount {
    public double calculate(double price) {
        return price * 0.2;
// 20% скидка
    }
}


// Класс для расчёта скидки
class DiscountCalculator {
    public double calculate(Discount discount, double price) {
        return discount.calculate(price);
    }
}


// Использование
public class SOLIDex {
    public static void main(String[] args) {
        Discount regular = new RegularDiscount();
        Discount vip = new VIPDiscount();

        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("Regular discount: " + calculator.calculate(regular, 100));
        System.out.println("VIP discount: " + calculator.calculate(vip, 100));
    }
}
