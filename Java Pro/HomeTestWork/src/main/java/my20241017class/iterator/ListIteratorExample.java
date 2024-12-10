package my20241017class.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("is");
        list.add("the");
        list.add("programming");
        list.add("language");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        ListIterator<String> listIterator1 = list.listIterator();
        listIterator1.next();
        listIterator1.next();
        listIterator1.next();
        System.out.println(listIterator1.previous());
        listIterator1.add("worst");
        listIterator1.previous();
        listIterator1.add("not");
        listIterator1.add("the");

        System.out.println(list);
    }
}
