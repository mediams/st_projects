package my20241108summary;

import java.util.HashMap;
import java.util.Map;

public class Tasks2 {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 2, 1, 5, 4};

        System.out.println("areArraysEqual(array1, array2) = " + areArraysEqual(array1, array2));

    }
//2. Проверьте, равны ли два массива или нет
//   (массивы считаются равными, если содержат одинаковые элементы, порядок не важен)

    public static boolean areArraysEqual(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }

        Map<Integer, Integer> map1 = new HashMap<>();
        for(int i : array1){
            map1.put(i, map1.getOrDefault(i, 0)+1);
        }

        Map<Integer, Integer> map2 = new HashMap<>();
        for(int i : array2){
            map2.put(i, map2.getOrDefault(i, 0)+1);
        }

        return map1.equals(map2);

    }


}
//2. Проверьте, равны ли два массива или нет
//        (массивы считаются равными, если содержат одинаковые элементы, порядок не важен)