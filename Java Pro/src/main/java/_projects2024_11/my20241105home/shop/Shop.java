package _projects2024_11.my20241105home.shop;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Shop {
    public static void main(String[] args) {
        Queue<Item> items = new PriorityQueue<>(); // hier kann man ein Comparator stehen
//        Queue<String> queue = new PriorityQueue<>( 5, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
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
            System.out.println("Customer" + ", buy a " + items.poll());
        }

    }
}
