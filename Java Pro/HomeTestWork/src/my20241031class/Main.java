package my20241031class;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(0, 2, 3, 5, 8, 9, 4));
        Set<Integer> listCopy = new TreeSet<>(list);

        sortWith(list);
        System.out.println(list);
    }

    private static Set<Integer> sortWith(List<Integer> list) {
        Set<Integer> listCopy = new TreeSet<>(list);
        return listCopy;
    }
}
// 1. Set<String> names ------> Set<Integer> длины имен
// 2. Имеется текст "Hello world!!!". Вывести уникальный набор символов
// 3. Имеется список Integer, отсортировать его через set