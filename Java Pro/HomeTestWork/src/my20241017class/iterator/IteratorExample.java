package my20241017class.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

//        for (int i = 0; i < list.size(); i++) {
////            String elment = list.get(i);
//            System.out.println(list.get(i));
//        }
//        System.out.println();
//
//        for (String s : list){ // for -each loop depends on iterator
////            String element = s;
//            System.out.println(s);
//        }

        Iterator<String> iterator = list.iterator();
        boolean hasNext = iterator.hasNext();
        String nexElement = iterator.next();

        System.out.println(nexElement);
        nexElement = iterator.next();
        System.out.println(nexElement);
        nexElement = iterator.next();
        System.out.println(nexElement);
        nexElement = iterator.next();
        System.out.println(nexElement);
        nexElement = iterator.next();
        System.out.println(nexElement);

        System.out.println("-");
        if (iterator.hasNext()) {
            nexElement = iterator.next();
            System.out.println(nexElement);
        }
        System.out.println("-");


        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            String element = iterator2.next();
            System.out.println(element);
        }

        Iterator<String> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            String element = iterator3.next();
            if (element.equals("One")) {
                iterator3.remove();
                break;
            }
        }
        System.out.println(list);

    }
}
