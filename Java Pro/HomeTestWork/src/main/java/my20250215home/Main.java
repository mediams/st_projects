package my20250215home;

import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }
}
public class Main {
    public static void main(String[] args) {
        GroceryItem[] grocceryArray = new GroceryItem[3];
        grocceryArray[0] = new GroceryItem("milk");
        grocceryArray[1] = new GroceryItem("apple", "PRODUCE", 6);
        grocceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(grocceryArray));
    }
}
