package my20250215home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListEx {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First", "Second", "Third"};
        var originalList =  Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray)); //Aber warum in diesem Mal bekommen wir beide ArrayList und Array anderen?

        originalList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(originalArray));
    }

}
