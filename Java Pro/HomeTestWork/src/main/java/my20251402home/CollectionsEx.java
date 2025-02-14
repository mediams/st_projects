package my20251402home;

import my20250124summary.Library;

import java.util.*;

public class CollectionsEx {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o2, Integer o1) {
                return o1 - o2;
            }
        };

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
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Collections.sort(integerList, comparator);
        System.out.println(integerList);

        System.out.println(integerList.get(1));
        System.out.println(integerList.indexOf(1));

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next() + " - ");


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Test-1");
        map.put(2, "Test-2");
        map.put(3, "Test-3");

        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println(integer + " - " + map.get(integer));
        }

    }
}
