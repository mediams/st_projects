package my20241126practice;

import java.util.ArrayList;
import java.util.List;

public class GenEx {
    public static void main(String[] args) {
//        List list = new ArrayList();
        //list.add((String)"a")
        List<String> list = new ArrayList<>();

        list.add("a");
//        list.add(1);

        Box box = new Box();
        box.setT("Test");
        System.out.println(box.getT());

        Integer[] array = new Integer[]{1, 2, 3, 5, 4, 6};
        System.out.println(Utility.printArray(array));

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("intArray: ");
        System.out.println(Utility.printArray2(intArray));
    }
}
