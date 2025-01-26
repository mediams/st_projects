package my20250123home;

import java.util.HashMap;
import java.util.Map;

// 1. Интерфейс для расчёта скидки
interface DiscountStrategy {
    double calculateDiscount(double price);
}

// 2. Реализация для обычного клиента
class RegularDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.1; // 10% скидка
    }
}

// 3. Реализация для VIP клиента
class VipDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.2; // 20% скидка
    }
}

// 4. Можно добавить новый класс без изменения существующего кода
class SuperVipDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.3; // 30% скидка
    }
}

// 5. Основной класс, который использует стратегию
class DiscountCalculator {
    private static final Map<String, DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put("Regular", new RegularDiscount());
        strategies.put("VIP", new VipDiscount());
        strategies.put("SuperVIP", new SuperVipDiscount()); // Добавляем новый тип без изменения кода!
    }

    public double calculateDiscount(String customerType, double price) {
        return strategies.getOrDefault(customerType, price1 -> 0.0).calculateDiscount(price);
    }
}

