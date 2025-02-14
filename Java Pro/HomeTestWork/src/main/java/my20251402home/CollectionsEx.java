package my20251402home;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsEx {
    public static void main(String[] args) {
        int[] intArray  = {1, 2};;
        intArray[0] = 13;
        intArray[1] = 21;

        System.out.println(intArray[1]);

        Collection<Integer> collection = new ArrayList();
        collection.add(1);
//        collection.add("Test");

        System.out.println(collection);
    }
}
