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
        Pizza pizza8 = new Pizza("Spicy2", 1, "John", true);

        List<Pizza> pizzas = List.of(pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7, pizza8);

        HashSet<String> uniquePizzas = new HashSet<>();
        for (Pizza p : pizzas) {
            uniquePizzas.add(p.getCookName());
        }
        System.out.println(uniquePizzas);

        HashMap<String, Integer> countPizzas = new HashMap<>();
        for (Pizza p : pizzas) {
            if (p.isPresent()) {
                if (!countPizzas.containsKey(p.getCookName())) {
                    countPizzas.put(p.getCookName(), 1);
                } else {
                    countPizzas.put(p.getCookName(), countPizzas.get(p.getCookName()) + 1);
                }
            }
        }

        System.out.println(countPizzas);

        Map<String, Set<String>> namesPizzaEachCooker = new HashMap<>();

        for (Pizza p : pizzas) {
            if (!namesPizzaEachCooker.containsKey(p.getCookName())) {
                namesPizzaEachCooker.put(p.getCookName(), new HashSet<>(Set.of(p.getName())));
            } else {
                namesPizzaEachCooker.get(p.getCookName()).add(p.getName());
            }
        }
        System.out.println(namesPizzaEachCooker);
    }
}

//Создай Map<String, Set<String>>, где ключом будет имя повара, а значением — Set с именами всех пицц, которые он приготовил.
//Здесь удобно использовать HashSet для хранения уникальных имен пицц для каждого повара.
