package _projects2024_11.my20241121class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listList = new ArrayList<>();
        listList.add(new ArrayList<>());
        listList.add(new ArrayList<>());
        listList.add(new ArrayList<>());
        listList.get(0).add("A");
        listList.get(0).add("B");
        listList.get(0).add("C");
        listList.get(1).add("D");
        listList.get(1).add("E");
        listList.get(1).add("F");
        listList.get(2).add("J");
        listList.get(2).add("H");
        listList.get(2).add("G");

        Stream<List<String>> stream = listList.stream();
        stream.forEach(System.out::println);
        Stream<String> stringStream = listList.stream().flatMap(list -> list.stream());
        stringStream.forEach(System.out::print);

        List<String> strings = List.of("One", "banana", "Two", "apple");
        strings.stream()
                .flatMap(s -> s.chars().mapToObj(value -> value))
                .map(c -> Character.toString(c))
                .distinct()
                .forEach(System.out::println);


    }
}
