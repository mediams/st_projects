package _projects2024_11.my20241113home;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx {
    public static void main(String[] args) {
//        Runnable runnable = () -> System.out.println("Something.");
//        new Thread(runnable).start();

        Comparator<String> comparator = (o1, o2) -> Integer.compare(o1.length(), o2.length());

        Function<String, Integer> function = s -> s.length();

        Predicate<Integer> predicate = integer -> integer % 2 == 0;


        List<String> list = Arrays.asList("Первый", "Второй", "Третий");

        // Создаем Consumer с лямбда-выражением для вывода каждого элемента
        Consumer<String> printConsumer = element -> System.out.println(element);

        // Проходим по каждому элементу списка и применяем наш Consumer
        list.forEach(printConsumer);

        Consumer<String> printConsumer2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi");
            }
        };
    }
}


//Создай лямбда-выражение для интерфейса Runnable, которое выводит сообщение на экран.
//Напиши Comparator для сравнения двух строк по их длине.
//Напиши лямбда-выражение для интерфейса Function, которое преобразует строку в её длину.
//Используй интерфейс Predicate и лямбда-выражение для проверки, является ли число чётным.
//        Создай Consumer с лямбда-выражением, который будет выводить каждый элемент списка.

