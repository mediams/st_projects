package my20251402home;

import my20250124summary.Library;

import java.util.*;

public class CollectionsEx {
    public static void main(String[] args) {
        int[] intArray  = {1, 2};;
        intArray[0] = 13;
        intArray[1] = 21;

        System.out.println(intArray[1]);

        Collection<Object> collection = new ArrayList();
        collection.add(1);
        collection.add("Test");

        System.out.println(collection);

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);

        System.out.println(integerList.get(1));
        System.out.println(integerList.indexOf(1));

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next() + " - ");
    }
}
