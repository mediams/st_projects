package my20241113home;

import java.util.Comparator;

public class LambdaEx {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Something.");
        new Thread(runnable).start();

        Comparator<String> comparator = (o1, o2) -> Integer.compare(o1.length(), o2.length());
    }
}
//Создай лямбда-выражение для интерфейса Runnable, которое выводит сообщение на экран.
//Напиши Comparator для сравнения двух строк по их длине.
