package _projects2024_11.my20241107class.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Pizza {
    private String name;
    private int size;
    private String cookName;
    private boolean isPresent;

    public Pizza(String name, int size, String cookName, boolean isPresent) {
        this.name = name;
        this.size = size;
        this.cookName = cookName;
        this.isPresent = isPresent;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getCookName() {
        return cookName;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Margarita", 2, "Peter", true);
        Pizza pizza2 = new Pizza("4 Cheese", 5, "Mark", true);
        Pizza pizza3 = new Pizza("Pepperoni", 3, "Peter", false);
        Pizza pizza4 = new Pizza("Diablo", 1, "John", true);
        Pizza pizza5 = new Pizza("With Pork", 6, "Peter", false);
        Pizza pizza6 = new Pizza("Vegetarian", 2, "Steve", true);
        Pizza pizza7 = new Pizza("Spicy", 1, "John", true);

        List<Pizza> pizzas = List.of(pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7);

        Map<String, Boolean> mapIsPizzaPresent = new TreeMap<>();
        for (Pizza pizza : pizzas) {
            mapIsPizzaPresent.put(pizza.name, pizza.isPresent);
        }
        System.out.println("mapPizzasPresent = " + mapIsPizzaPresent);

        Map<String, Integer> mapPizzaCount = new HashMap<>();
        for (Pizza pizza : pizzas) {
            if (!mapPizzaCount.containsKey(pizza.cookName)) {
                mapPizzaCount.put(pizza.cookName, 1);
            } else {
                mapPizzaCount.put(pizza.cookName, mapPizzaCount.get(pizza.cookName) + 1);
            }
        }
        System.out.println("mapPizzaCount = " + mapPizzaCount);

        //   c. Получить Map<String, Set<String>> повар / список имен пиц, приготовленных этим поваром
//        Map<String, Set<String>>
    }
}
