package my20241031homework;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWorkEx {
    public static void main(String[] args) {
        System.out.println("//        Из изначально данного Set names получить Set длин имен");

        Set<String> list = new TreeSet<>(List.of("Emma", "Roma", "Nicolay"));
        Set<Integer> length = new TreeSet<>();
        for (String s : list) {
            length.add(s.length());
        }
        System.out.println(length);

//        Имеется текст "Hello world!!!". Вывести уникальный набор символов
        

    }
}
