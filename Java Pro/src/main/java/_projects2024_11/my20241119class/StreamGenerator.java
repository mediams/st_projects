package _projects2024_11.my20241119class;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamGenerator {
    public static void main(String[] args) {

        //stream generation
        Stream<Integer> list = Stream.of(1, 2, 3, 5, 7, 8, 9, 10);
        System.out.println("Stream created");
        List<Integer> listOfList = List.of(1, 2, 3, 4);

        Stream<Integer> integerStream = listOfList.stream();

        Integer[] array = {1, 2, 3};
        Stream<Integer> integerStream1 = Arrays.stream(array);

        // intermediate operation
        Stream<Integer> stream = list
                .filter(integer -> integer % 2 == 1)
                .peek(integer -> System.out.println("integer " + integer))
                .limit(3);
        System.out.println("Stream intermediate operation defined");

        // terminal operation
        System.out.println("Terminal peration invocation:");
        List<Integer> result = stream.toList();
//        stream.toList(); // IllegalStateException
        System.out.println(result);

        List<String> stringList = List.of("A", "B", "C", "D", "city", "dog");
        stringList.stream().filter(s -> s.length() <= 3).peek(System.out::println).toList();
        result.stream().forEach(System.out::print);
        result.forEach(System.out::print);
        stringList.forEach(System.out::println);
    }
}
