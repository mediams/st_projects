package _projects2024_11.my20241112home;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx {
    public static void main(String[] args) {
//        Создай лямбда-выражение для интерфейса Runnable, которое выводит сообщение на экран.
        Runnable runnable = () -> System.out.println("Test Lambdas");
        new Thread(runnable).start();

//        Напиши Comparator для сравнения двух строк по их длине.
        List<String> strings = Arrays.asList("banana", "apple", "kiwi", "orange");
        Comparator<String> lengthComparator = (o1, o2) -> Integer.compare(o1.length(), o2.length());
        Comparator<String> abcComparator = (o1, o2) -> o1.compareTo(o2);
        strings.sort(lengthComparator);
        System.out.println(strings);

        strings.sort(abcComparator);
        System.out.println(strings);

//        Напиши лямбда-выражение для интерфейса Function, которое преобразует строку в её длину.
        Function<String, Integer> stringLengthFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Function<String, Integer> stringLengthFunctionLambda = s -> s.length();
        String string = "Hallo text.";
        int num = stringLengthFunctionLambda.apply(string);
        System.out.println("Length of String \"" + string + "\" is " + num);

//        Используй интерфейс Predicate и лямбда-выражение для проверки, является ли число чётным.
        Predicate<Integer> isEven = integer -> integer % 2 == 0;
        System.out.println(isEven.test(15));
    }
}
