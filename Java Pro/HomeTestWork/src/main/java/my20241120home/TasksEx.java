package my20241120home;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TasksEx {
    public static void main(String[] args) {
        Stream<Integer> streamFromIterate = Stream.iterate(5, n -> n + 1);
        streamFromIterate.limit(5).forEach(System.out::println);
// 1, 2, 3, 4, 5
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
        streamFromGenerate.limit(3).forEach(System.out::println);
// a1, a1, a1
        List<String> list = List.of("a1", "a2", "a3");
        List<String> result = list.stream()
                .peek(s -> System.out.println("Обработка: " + s))
// Выводим каждый элемент
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
// [A1, A2, A3]
        Set<String> set = Set.of("a1", "a2", "a3");
        Set<String> newSet = set.stream().map(p -> p + "_1").collect(Collectors.toSet());
        System.out.println(newSet);
// a1_1, a2_1, a3_1

    }
}
