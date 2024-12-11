package _projects2024_11.my20241105home.shop;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Warehouse1 {
    Queue<Item> itemsList;

    public Warehouse1(Queue<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public void getItems() {
        Random random = new Random();
        Item item = new Item("Item " + random.nextInt(10), random.nextDouble());
        itemsList.add(item);
        System.out.println("Item is added.");
    }
}
