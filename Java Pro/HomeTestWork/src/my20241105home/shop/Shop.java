package my20241105home.shop;

import java.util.PriorityQueue;
import java.util.Queue;

public class Shop {
    public static void main(String[] args) {
        Queue<Item> items = new PriorityQueue<>();
        Warehouse1 warehouse1 = new Warehouse1(items);
        Warehouse2 warehouse2 = new Warehouse2(items);
        warehouse1.getItems();
        warehouse1.getItems();
        warehouse1.getItems();
        warehouse2.getItems();
        warehouse2.getItems();
        warehouse2.getItems();

        System.out.println(items);

        while (!items.isEmpty()) {
            System.out.println("Customer # " + items.size() + ", buy a " + items.poll());
        }

    }
}
