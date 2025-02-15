package my20250215home;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items); //list.of
        System.out.println(list);

        System.out.println(list.getClass().getName());

        ArrayList<String> arrayList = new ArrayList<>(list); //give me sposopi zapolneneia ArrayList
        arrayList.add("Brot");
        System.out.println(arrayList);

        ArrayList<String> stringArrayList = new ArrayList<>(
                List.of("banana", "milk", "kiwi")
        );
        System.out.println(stringArrayList);

        arrayList.addAll(stringArrayList); //addAll
        System.out.println(arrayList);

        System.out.println(arrayList.get(3)); //get

        if (arrayList.contains("milk")) { //.contains
            System.out.println("milk gefunded!");
        }

        System.out.println("first = " + arrayList.indexOf("mill")); //.indexOf
        System.out.println("last = " + arrayList.lastIndexOf("mill")); //.lastIndexOf

    }
}
