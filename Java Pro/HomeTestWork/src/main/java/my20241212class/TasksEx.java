package my20241212class;

import java.util.*;

public class TasksEx {
    public static void main(String[] args) {
//        1. Напишите метод и тест для него для поиска общих элементов между двумя массивами целых чисел
//        example input:
//        Array1: [1, 2, 5, 5, 8, 9, 7, 10]
//        Array2: [1, 0, 6, 15, 6, 4, 7, 0]
//        example expected:
//        [1,7]

        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
        findSomeNumbers(array1, array2);

//        2. Напишите метод и тест для него для удаления повторяющихся элементов из массива.
//        example input:
//        [0,3,-2,4,3,2]
//        example expected:
//        [0,3,-2,4,2]

        int[] arrayIntegers = {0, 3, -2, 4, 3, 2};

        getUniugeNumbers(arrayIntegers);

    }

    public static Set<Integer> getUniugeNumbers(int[] arrayIntegers) {
        Set<Integer> sortInteger = new HashSet<>();
        for (int i : arrayIntegers){
            sortInteger.add(i);
        }
//        System.out.println(sortInteger);
        return sortInteger;
    }

    public static List<Integer> findSomeNumbers(int[] array1, int[] array2) {
        List<Integer> someNumbers = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    someNumbers.add(array1[i]);
                }
            }
        }
//        System.out.println(someNumbers);
        return someNumbers;
    }
}
