package my20241115summary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
//import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class Tasks {
    public static void main(String[] args) {
//        1. Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int

        BiFunction<Integer, Integer, Integer> multiplication = (i1, i2) -> {
            int result = 1;
            for (int i = 0; i < i1; i++) {
                result *= i2;
            }
            return result;
        };
        System.out.println(multiplication.apply(3, 2));

//        2.Создать три функции:
//        - обрезает входную строку до 11 символов,
//                - добавялет текст "Info: " перед
//                - делает основной текст upper case
//                Составить композитную функцию так, чтобы:
//        Input:
//        "Some random data"
//        Output:
//        "Info: SOME RANDOM

        Function<String, String> function = s -> s.toUpperCase();
        Function<String, String> functionEx = String::toUpperCase; // the same
        Function<String, String> function2 = s -> s.substring(0, 11);
        Function<String, String> function3 = s -> "Info: " + s;

        System.out.println(function.andThen(function2).andThen(function3).apply("Some random data"));

//        3. Написать метод, который на вход принимает список String и производит фильтрацию данных согласно реализации
//        интерфейса Filter (например, через лямбда-выражение)
//        Интерфейс Filter имеет метод apply (String data), с помощью которого можно будет указывать способ фильтрации.
//        interface Filter {
//            boolean apply(String data);
//        }
//        Отфильтрованные данные возвращаются в новом списке.

        List<String> list = new ArrayList<>();

        list.add("Hellod");
        list.add("World");
        list.add("Test");
        list.add("One");


        extracted(list);

    }

    private static void extracted(List<String> list) {
        Filter filter = s -> s.length() > 5;

        List<String> filteredList = new ArrayList<>();

        for (String s : list) {
            if (filter.apply(s)) {
                filteredList.add(s);
            }
        }
        System.out.println(filteredList);
    }
}
