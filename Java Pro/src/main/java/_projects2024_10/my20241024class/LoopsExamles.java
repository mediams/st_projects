package _projects2024_10.my20241024class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LoopsExamles {
    public static void main(String[] args) {
        List<String> data = List.of("A", "B", "C", "D", "E", "F");
        List<String> listArray = new ArrayList<>(data);
        List<String> listLinked = new LinkedList<>(data);

        System.out.println("for i");
        for (int i = 0; i < listArray.size(); i++) { // n
            System.out.print(listArray.get(i));
        }
        System.out.println();
        for (int i = 0; i < listLinked.size(); i++) { // n^2 non effective
            System.out.print(listLinked.get(i));
        }

        System.out.println("\nfor Each\n");
        for (String s : listArray) {// n
            System.out.print(s);
        }
        System.out.println();
        for (String s : listLinked) {// n effective
            System.out.print(s);
        }
        System.out.println();
        Iterator<String> iterator = listLinked.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
