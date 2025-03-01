package _projects2024_10.my20241015class.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExamples {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // String
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
        System.out.println(list);

        List<Integer> integerList = new ArrayList<>(100);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        for (String s : list) {
            System.out.println("s = " + s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i + list.get(i) = " + i + list.get(i));
        }

        list.set(3, "New value");
        list.add(5, "Value 20");
        System.out.println(list);

        List<String> list2 = new ArrayList<>(list);
        List<String> list3 = List.of("A", "B", "C");
        list2.add("D");

//        list2 = new ArrayList<>(list3);
//        list2 = list3;
        list2.add("D");
        System.out.println("list2 = " + list2);

        System.out.println(list);
        int index = list.indexOf("B");
        System.out.println(index);
        System.out.println(list.contains("A"));

        System.out.println();
        list.remove(index);
        System.out.println("list = " + list);

        ArrayList<String> arrayList = (ArrayList<String>) list;
//        arrayList.trimToSize();
//        arrayList.toArray();
        String newString = list.toString();
        String newString2 = String.join(" ", list);
        System.out.println(newString);
        System.out.println(newString2);
        list.remove("Value 20");
        System.out.println(list);
        list.clear();

        System.out.println();
        List objectList = new ArrayList();
        objectList.add("String");
        objectList.add(1);
        objectList.add(1.0);
        objectList.add(true);
        Object objects1 = objectList.get(0);
        Object objects2 = objectList.get(1);
        Double objects3 = (Double) objectList.get(2);
        Boolean objects4 = (Boolean) objectList.get(3);
        System.out.println(objects4);

    }
}
