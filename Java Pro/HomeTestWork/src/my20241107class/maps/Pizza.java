package my20241107class.maps;

import java.util.List;

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

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza( "Margarita",2,  "Peter", true);
        Pizza pizza2 = new Pizza( "4 Cheese",5,  "Mark", true);
        Pizza pizza3 = new Pizza( "Pepperoni",3,  "Peter", false);
        Pizza pizza4 = new Pizza( "Diablo",1,  "John", true);
        Pizza pizza5 = new Pizza( "With Pork",6,  "Peter", false);
        Pizza pizza6 = new Pizza( "Vegetarian",2,  "Steve", true);
        Pizza pizza7 = new Pizza( "Spicy",1,  "John", true);

        List.of(pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7);

        
    }
}
