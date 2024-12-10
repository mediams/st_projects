package my20241108summary;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Tasks {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6};
        int k = 1;

        System.out.println(getElemnt(array, k)); //сколько раз встречается
    }
    private static int getElemnt(Integer[] array, int k) {

        Map<Integer, Integer> arrayMap = new HashMap<>();

        for (Integer i : array) {
//            arrayMap.put(i, arrayMap.getOrDefault(i, 0) + 1);
            if (!arrayMap.containsKey(i)) {
                arrayMap.put(i, 1);
            }else{
                arrayMap.put(i, arrayMap.get(i) + 1);
            }
        }
        System.out.println(arrayMap);

        for (Integer i : array) {
            if (arrayMap.get(i) == k) {
                return i;
            }
        }
        return -1;
    }
}
//1. Найти первый элемент, встречающийся k раз в массиве
