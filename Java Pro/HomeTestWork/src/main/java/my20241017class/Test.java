package my20241017class;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> arrayString = new ArrayList<>();
        arrayString.addAll(Arrays.asList("Add", "new", "noch"));

        System.out.println(arrayString);

        Integer[] integerArray = new Integer[5];
        List<Integer> integerList = new ArrayList<>(10);

        int[] intsArray = new int[10];
//        List<int> intsList = new ArrayList<>(10); -- ein Fehler;

        integerArray[4] = 100;
        integerList.add(100);
        integerList.add(0);

        System.out.println(Arrays.toString(integerArray));
        System.out.println(integerList);

//        Arrays.sort(integerArray); // int - quick sort; Integer - mergesort
//        Collections.sort(integerList); // mergesort

        String[][] arraysOfArray = new String[3][4];
        arraysOfArray[0] = new String[1];
        arraysOfArray[1] = new String[3];
        arraysOfArray[2] = new String[2];
        System.out.println(Arrays.deepToString(arraysOfArray));
        System.out.println(arraysOfArray[1][2]);

        List<List<String>> listOfList = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        listOfList.add(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("E");
        listOfList.add(list2);
        List<String> list3 = new ArrayList<>();
        list3.add("F");
        list3.add("G");
        listOfList.add(list3);
        System.out.println(listOfList);
        System.out.println(listOfList.get(1).get(1));


    }
}
