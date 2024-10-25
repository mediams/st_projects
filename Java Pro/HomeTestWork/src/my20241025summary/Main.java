package my20241025summary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listArray = new ArrayList<>();
        List<Integer> listLinked = new LinkedList<>();
        int m = 100000;
        Random random = new Random(m);

        for (int i = 0; i < m; i++) {
            int num = random.nextInt();
            listLinked.add(num);
            listArray.add(num);
        }

        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum+=listArray.get(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time for ArrayList (fori) elapsed: " + (end - start));

        start = System.currentTimeMillis(); // O(n^2)
        sum = 0;
        for (int i = 0; i < m; i++) {
            sum+=listLinked.get(i);
        }

        end = System.currentTimeMillis();
        System.out.println("Time for LinkedList (fori) elapsed: " + (end - start));

        // for each

        start = System.currentTimeMillis();
        sum = 0;
        for (Integer i : listArray) {
            sum+=i;
        }
        end = System.currentTimeMillis();
        System.out.println("Time for ArrayList (for each) elapsed: " + (end - start));

        start = System.currentTimeMillis();
        sum = 0;
        for (Integer i : listLinked) {
            sum+=i;
        }
        end = System.currentTimeMillis();
        System.out.println("Time for LinkedList (for each) elapsed: " + (end - start));

        //iterator

        start = System.currentTimeMillis();
        sum = 0;
        Iterator <Integer> iterator = listArray.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            sum+=i;
        }
        end = System.currentTimeMillis();
        System.out.println("Time for ArrayList (iterator) elapsed: " + (end - start));

        start = System.currentTimeMillis();
        sum = 0;
        Iterator <Integer> iterator2 = listLinked.iterator();
        while (iterator2.hasNext()) {
            int i = iterator2.next();
            sum+=i;
        }
        end = System.currentTimeMillis();
        System.out.println("Time for LinkedList (iterator) elapsed: " + (end - start));
    }
}
