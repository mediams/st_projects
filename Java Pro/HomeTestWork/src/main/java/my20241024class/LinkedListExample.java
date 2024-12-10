package my20241024class;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");


        list.add(list.size(), "Six");
        System.out.println(list);

        list.remove(5);
        list.remove("Six");

        System.out.println(list.get(2));
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>(list);
        list2.addFirst("FirstElement");
        list2.addLast("LastElement");

        System.out.println(list2.contains("One"));

        System.out.println(list2);

        for (String s : list2) {
            System.out.println(s);
        }

        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()){
            iterator.next();
        }
    }
}
