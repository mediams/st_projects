package my20241031homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWorkEx {
    public static void main(String[] args) {

        Set<String> list = new TreeSet<>(List.of("Emma", "Roma", "Nicolay"));
        System.out.println("//        Из изначально данного Set names " + list + " получить Set длин имен");
        Set<Integer> length = new TreeSet<>();
        for (String s : list) {
            length.add(s.length());
        }
        System.out.println(length);

        System.out.println("//        Имеется текст Hello world!!!. Вывести уникальный набор символов");

        String text = "Hello world!!!";
        Set<Character> uniqCharacter = new TreeSet<>();
        for (int i = 0; i < text.length(); i++) {
            uniqCharacter.add(text.charAt(i));
        }
        System.out.println(uniqCharacter);


        System.out.println("  Напишите метод, чтобы получить первое и последнее вхождение элементов в отсортированном списке.");
        /*
        input:
        list = {1, 1, 2, 2, 2, 2, 2, 2, 4, 4, 5, 7, 9, 10}, element = 2
        list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, element = 2
        output:
        2 (индекс первого вхождения), 7 (индекс последнего вхождения)
         */

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10));
        int target = 2;
        int left = 0;
        int right = integerList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int current = integerList.get(mid);

            if (current == target) {
                if ((target > integerList.get(mid - 1))) {
                    System.out.println(mid);
                    return;
                } else right = mid - 1;
            } else if (current > target) {
                right = mid - 1;
            } else left = mid + 1;
        }
    }
}
