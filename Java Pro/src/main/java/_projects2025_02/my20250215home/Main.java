package my20250215home;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }

    @Override
    public String toString() {
        return String.format("\n%d %s in %s", count, name.toUpperCase(), type.toUpperCase());
    }
}
public class Main {
    public static void main(String[] args) {
        GroceryItem[] grocceryArray = new GroceryItem[3];
        grocceryArray[0] = new GroceryItem("milk");
        grocceryArray[1] = new GroceryItem("apple", "PRODUCE", 6);
        grocceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(grocceryArray));

        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Brote"));
        groceryItems.add(new GroceryItem("milk"));
        groceryItems.add(new GroceryItem("apple", "PRODUCE", 6));
        System.out.println(groceryItems);

        System.out.println("-----------------------------------------");

        groceryItems.add(1, new GroceryItem("Cola")); // add
        groceryItems.add(new GroceryItem("Kuchen")); // addFirst
        groceryItems.remove(3); //remove
        System.out.println(groceryItems);
    }
}
