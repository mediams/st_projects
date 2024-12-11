package _projects2024_10.my20241031homework_binary_first_last;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWorkEx {
    public static void main(String[] args) {

        Set<String> list = new TreeSet<>(List.of("Emma", "Roma", "Nicolay"));
        System.out.println("//        \nИз изначально данного Set names " + list + " получить Set длин имен");
        Set<Integer> length = new TreeSet<>();
        for (String s : list) {
            length.add(s.length());
        }
        System.out.println(length);

        System.out.println("//        \nИмеется текст Hello world!!!. Вывести уникальный набор символов");

        String text = "Hello world!!!";
        Set<Character> uniqCharacter = new TreeSet<>();
        for (int i = 0; i < text.length(); i++) {
            uniqCharacter.add(text.charAt(i));
        }
        System.out.println(uniqCharacter);


        System.out.println("  \nНапишите метод, чтобы получить первое и последнее вхождение элементов в отсортированном списке.");
        /*
        input:
        list = {1, 1, 2, 2, 2, 2, 2, 2, 4, 4, 5, 7, 9, 10}, element = 2
        output:
        2 (индекс первого вхождения), 7 (индекс последнего вхождения)
         */

        List<Integer> integerList = new ArrayList<>(List.of(1, 1, 2, 2, 2, 2, 2, 2, 4, 4, 5, 7, 9, 10));
        int element = 2;
        findFirstAndLastElement(integerList, element);
    }

    private static void findFirstAndLastElement(List<Integer> integerList, int target) {
        int left = 0;
        int right = integerList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int current = integerList.get(mid);
            if (current == target) {
                if ((target > integerList.get(mid - 1))) {
                    System.out.println("First index : " + mid);
                    break;
                } else right = mid - 1;
            } else if (current > target) {
                right = mid - 1;
            } else left = mid + 1;

            if (left > right) {
                System.out.println("Not found!");
                return;
            }
        }
        left = 0;
        right = integerList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int current = integerList.get(mid);
            if (current == target) {
                if ((target < integerList.get(mid + 1))) {
                    System.out.println("Last index : " + mid);
                    break;
                } else left = mid + 1;
            } else if (current > target) {
                right = mid - 1;
            } else left = mid + 1;
        }
    }
}