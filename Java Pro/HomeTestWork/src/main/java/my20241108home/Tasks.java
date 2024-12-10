package my20241108home;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;

public class Tasks {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 5, 6, 4, 8, 1, 2, 5};
//        Напишите метод, который принимает массив целых чисел и возвращает количество уникальных элементов в этом массиве.
        System.out.println(getUnigueElemnts(array));

        String string = "mamam";
//        Создайте метод, который проверяет, является ли строка палиндромом (читается одинаково слева направо и справа налево).
        System.out.println(isPalindrom(string));

//Напишите метод, который объединяет два массива целых чисел и возвращает новый массив, содержащий уникальные элементы из обоих массивов.
        int[] array1 = {1, 25, 46, 85, 95};
        int[] array2 = {1, 2, 2, 3, 5, 6, 4, 8, 1, 2, 5};

        System.out.println(getSomeArray(array1, array2));
    }

    private static HashSet<Integer> getSomeArray(int[] array1, int[] array2) {
        HashSet<Integer> someArray = new HashSet<>();
        for (Integer i : array1) {
            someArray.add(i);
        }
        for (Integer i : array2) {
            someArray.add(i);
        }
        return someArray;
    }

    private static boolean isPalindrom(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed = " + reversed);
        return str.equals(reversed);
    }

    private static int getUnigueElemnts(int[] array) {
        HashSet<Integer> listUnuqueElement = new HashSet<>();
        for (Integer i : array) {
            listUnuqueElement.add(i);
        }
        return listUnuqueElement.size();
    }
}
