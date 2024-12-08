package my20241121class;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3);
        intStream = IntStream.rangeClosed(1, 100);
        System.out.println(intStream.sum());

        System.out.println(IntStream.rangeClosed(1, 100).filter(value -> value == 2).findAny().getAsInt());

        Stream<Integer> stream = IntStream.rangeClosed(1, 10).boxed();
        Stream<String> stringStream = IntStream.rangeClosed(1, 10).mapToObj(value -> "" + value);
        stringStream.forEach(System.out::println);

        Integer[] data = new Integer[10];
        for (int i = 0; i < 10; i++) {
            data[i] = i;
        }
        System.out.println(Arrays.toString(data));

        IntStream.range(0, 10).forEach(i -> data[i] = i);
        System.out.println(Arrays.toString(data));

        List<String> listString = List.of("A", "B", "C", "D");
        listString.forEach(s -> System.out.println(s));

        int[][] ints = new int[4][5];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][i] = 7;
            }
        }

        IntStream.range(0, ints.length).forEach(i -> IntStream.range(0, ints[i].length)
                .forEach(j -> System.out.println("(i = " + i + ", j = " + j + ")")));
        IntStream.range(0, ints.length).forEach(i -> IntStream.range(0, ints[i].length)
                .forEach(j -> ints[i][j] = 7));




    }
}