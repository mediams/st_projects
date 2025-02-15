package my20250215home;

import java.util.*;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items); //list.of Array to ArrayList
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
        arrayList.addAll(List.of("Brot", "Milch", "Banane")); //intersenya zapis
        arrayList.addAll(Arrays.asList("Brötchen", "Radler")); //intersenya zapis
        System.out.println(arrayList);

        System.out.println(arrayList.get(3)); //get

        if (arrayList.contains("milk")) { //.contains
            System.out.println("milk gefunded!");
        }

        System.out.println("first = " + arrayList.indexOf("milk")); //.indexOf
        System.out.println("last = " + arrayList.lastIndexOf("milk")); //.lastIndexOf

        System.out.println(arrayList.removeAll(List.of("milk", "kiwi"))); //intersenya zapis
        arrayList.retainAll(List.of("milk", "bananas")); //.retainAll
        System.out.println(arrayList.isEmpty()); //.isEmpty()

//        arrayList.remove(arrayList.indexOf(List.of("milk")));
        System.out.println("first = " + arrayList.indexOf("milk")); //.indexOf

        arrayList.addAll(List.of("Brot", "Milch", "Banane"));

        Collections.sort(arrayList); //.sort Collections
        System.out.println(arrayList);

        arrayList.sort(Comparator.naturalOrder()); //.sort Comparator .reverseOrder() .naturalOrder()
        System.out.println(arrayList);
        System.out.println(arrayList.size()); //.size()
        var groceryArray = arrayList.toArray(new String[arrayList.size()]); // ArrayList to Array
        var groceryArray2 = arrayList.toArray(new String[0]);
        System.out.println("als array" + Arrays.toString(groceryArray));

        ArrayList<ArrayList<String>> arrayListArrayList = new ArrayList<>(); // Wie das funktioniert
    }
}
