package my20241024homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("Test", "Rot", "Gorg", "Ya", "Boba", "Grob"));

        searchShort(list); //Перебрать LinkedList и найти самую короткую строку.

        toOneString(list); //Перебрать LinkedList и объединить все строки в одну с использованием разделителя "|".

    }

    private static void toOneString(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        StringBuilder temp = new StringBuilder("");
        while (iterator.hasNext()) {
            temp.append(iterator.next() + " | ");
        }
        System.out.println("Обьедененные строки: " + temp);
    }

    private static void searchShort(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        String temp = list.get(0);
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (temp.length() > s.length()) {
                temp = s;
            }
        }
        System.out.println("Самая короткая строка: " + temp);
    }
}
