package my20241126practice;

import java.util.List;

public class Utility {
    public static <T> List<T> printArray(T[] array) {
        return List.of(array);
    }
    public static <T> List<T> printArray2(T[] array) {
        List<T> list = List.of(array);
        
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
        return list;
    }
}
