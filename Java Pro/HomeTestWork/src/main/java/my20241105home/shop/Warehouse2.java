package my20241105home.shop;

import java.util.Queue;
import java.util.Random;

public class Warehouse2 {
    Queue<Item> itemsList;

    public Warehouse2(Queue<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public void getItems() {
        Random random = new Random();
        Item item = new Item("Product " + random.nextInt(10), random.nextDouble());
        itemsList.add(item);
        System.out.println("Product is added.");
    }
}
