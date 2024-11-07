package my20241107home;

import my20241107class.maps.Pizza;

import java.util.*;

public class WorkEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Pizza pizza1 = new Pizza("Margarita", 2, "Peter", true);
        Pizza pizza2 = new Pizza("4 Cheese", 5, "Mark", true);
        Pizza pizza3 = new Pizza("Pepperoni", 3, "Peter", false);
        Pizza pizza4 = new Pizza("Diablo", 1, "John", true);
        Pizza pizza5 = new Pizza("With Pork", 6, "Peter", false);
        Pizza pizza6 = new Pizza("Vegetarian", 2, "Steve", true);
        Pizza pizza7 = new Pizza("Spicy", 1, "John", true);

        List<Pizza> pizzas = List.of(pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7);

        HashSet<String> uniquePizzas = new HashSet<>();
        for (Pizza p : pizzas) {
            uniquePizzas.add(p.getCookName());
        }
        System.out.println(uniquePizzas);

        HashMap<String, Integer> countPizzas = new HashMap<>();
        for (Pizza p : pizzas) {
            if (!countPizzas.containsKey(p.getCookName()) && countPizzas.containsKey(p.isPresent()) == true) {
                countPizzas.put(p.getCookName(), 1);
            } else {
                countPizzas.put(p.getCookName(), countPizzas.get(p.getCookName()) + 1);
            }
        }

        System.out.println(countPizzas);
    }
}
//        Используя HashMap, создай счетчик, который будет считать количество пицц, приготовленных каждым поваром.
//Этот шаг уже реализован в твоем коде, но попробуй еще раз,
// добавив дополнительные условия (например, учитывай только те пиццы, которые есть в наличии).
