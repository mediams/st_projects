package my20241126class;

import java.util.List;

public class StatefullOperation {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 6, 4, 5, 6, 7, 8, 9, 7, 5, 4);
        List<Integer> integerList = integers.stream()
                .peek(e -> System.out.println("Initial stream: " + e))
                .distinct() // O(n)
                .peek(e -> System.out.println("After distinct:" + e))
                .sorted() // O(n log n)
                .peek(e -> System.out.println("After sorted: " + e))
                .toList();
        System.out.println(integers);

        integers = integers.stream()
                .peek(e -> System.out.println("Initial stream: " + e))
                .sorted()
                .peek(e -> System.out.println("After distinct:" + e))
                .distinct()
                .peek(e -> System.out.println("After sorted: " + e))
                .toList();
        System.out.println(integerList);

    }
}
