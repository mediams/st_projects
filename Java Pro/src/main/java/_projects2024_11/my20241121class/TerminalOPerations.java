package _projects2024_11.my20241121class;

import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOPerations {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        List<Integer> listInt = integerList.stream().toList();
        listInt = integerList.stream().collect(Collectors.toList());
        listInt.stream().collect(Collectors.toCollection(ArrayList::new));
        listInt.stream().collect(Collectors.toCollection(LinkedList::new));


        Set<Integer> setInt = integerList.stream().collect(Collectors.toSet());
        setInt = integerList.stream().collect(Collectors.toCollection(HashSet::new));

        Optional<Integer> optionalInt = integerList.stream().filter(integer -> integer % 12 == 0).findFirst();
        System.out.println(optionalInt.orElse(-1));

        System.out.println(integerList.stream().findAny().orElse(-1));

        long count = integerList.stream().count();
        System.out.println(count);

        System.out.println(integerList.stream().anyMatch(integer -> integer % 7 == 0));
        System.out.println(integerList.stream().allMatch(integer -> integer % 1 == 0));
        System.out.println(integerList.stream().noneMatch(integer -> integer % 1 == 0));

        System.out.println(integerList.stream().min(Integer::compareTo).get());
        System.out.println(integerList.stream().max(Integer::compareTo));

        Integer[] array = integerList.stream().filter(integer -> integer % 2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));

        System.out.println(integerList.stream().reduce(1, (x, y) -> x * y));
        System.out.println(integerList.stream().reduce(0, (x, y) -> x + y));
        System.out.println(integerList.stream().reduce(0, (x, y) -> x + y));
        System.out.println(integerList.stream().reduce(0, (accumulator, y) -> accumulator + y));
        System.out.println(integerList.stream().reduce((accumulator, y) -> accumulator + y));
        System.out.println(integerList.stream().reduce((accumulator, y) -> accumulator + y * y));

        System.out.println(integerList.stream().reduce(0, (accumulator, y) -> accumulator + 1));
        System.out.println(integerList.stream().reduce((accumulator, y) -> Math.min(accumulator, y)));
        System.out.println(integerList.stream().reduce((accumulator, y) -> Math.max(accumulator, y)));

        List<String> stringList = List.of("One", "Two", "Three");
        System.out.println(stringList.stream().reduce("base: ", (s1, s2) -> s1 + " | " + s2));
        System.out.println(stringList.stream().reduce((s1, s2) -> s1 + " | " + s2).get());

    }
}
