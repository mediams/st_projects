package my20241112class.functionalinterfaces;

import java.util.*;
import java.util.function.*;

public class StandartFunctionalInterfaces {
    public static void main(String[] args) {
        Consumer<Integer> printData = integer -> System.out.println(integer);
        printData.accept(777);

//        Какие из выражений вернут true для массивов ниже?
        System.out.println("-------------------------");
        int[][] array1 = {{1, 2}, {3, 4}};
        int[][] array2 = {{1, 2}, {3, 4}};
        System.out.println(Arrays.equals(array1, array2));
        System.out.println(array1.equals(array2));
        System.out.println(array1 == array2);
        System.out.println(Arrays.deepEquals(array1, array2));
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        String[] array = new String[3];
        String text = "";
        for (int i = 0; i < 3; i++) {
            text+=array[i];
        }
        System.out.println(text);

        Set<Boolean> set1 = new TreeSet<>();
        Set<Boolean> set2 = new HashSet<>();
        set1.add(true); // 1
        set2.add(true); // 2

        List<Long> list = new ArrayList<>();
        list.add(2L);
        list.add(3L);
        list.add(null);
        list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(list);


        Supplier<String> generateString = () -> new Random().nextInt(10) + ", data";
        System.out.println(generateString.get());
        System.out.println(generateString.get());
        System.out.println(generateString.get());

        Function<Integer, Double> by10 = integer -> (double) integer / 10.0;
        System.out.println(by10.apply(5));
        System.out.println(by10.apply(4));
        System.out.println(by10.apply(7));

        UnaryOperator<Integer> multiülyByTwo = integer -> integer * 2;
        System.out.println(multiülyByTwo.apply(2));
        System.out.println(multiülyByTwo.apply(6));
        System.out.println(multiülyByTwo.apply(8));

        Predicate<String> isLongEnough = s -> s.length() > 5;
        System.out.println(isLongEnough.test("Hello!!!"));
        System.out.println(isLongEnough.test("Hell"));
        System.out.println(isLongEnough.test("!!!"));

    }
}
//void -> void
//data -> void ---- Consumer
/**
 * принимает данные, но ничего не возвращает. (data -> void)
 * Пример: Consumer<String> print = s -> System.out.println(s);
 * <p>
 * ничего не принимает, но возвращает данные. (void -> data)
 * Пример: Supplier<String> provideText = () -> "Sample Text";
 * <p>
 * принимает данные и возвращает другие данные. (data -> data2)
 * Пример: Function<String, Integer> length = s -> s.length();
 * <p>
 * ничего не принимает, но возвращает данные. (void -> data)
 * Пример: Supplier<String> provideText = () -> "Sample Text";
 * <p>
 * принимает данные и возвращает другие данные. (data -> data2)
 * Пример: Function<String, Integer> length = s -> s.length();
 * <p>
 * это функциональный интерфейс, который принимает один аргумент и возвращает результат того же типа. Если упрощенно: "data1 -> data2", где data1 и data2 одного и того же типа.
 * Его часто используют для модификации или обработки одного объекта и возвращения изменённого объекта того же типа.
 */
//void -> data ---- Supplier
/**
 * ничего не принимает, но возвращает данные. (void -> data)
 * Пример: Supplier<String> provideText = () -> "Sample Text";
 */
//data -> data2 ---- Function - Operator
/**
 * принимает данные и возвращает другие данные. (data -> data2)
 * Пример: Function<String, Integer> length = s -> s.length();
 */
//data1 -> data2 ---- UnaryOperator - Operator
/**
 * это функциональный интерфейс, который принимает один аргумент и возвращает результат того же типа. Если упрощенно: "data1 -> data2", где data1 и data2 одного и того же типа.
 * Его часто используют для модификации или обработки одного объекта и возвращения изменённого объекта того же типа.
 */
//(data2, data2) -> data3 ---- BiFunction - BinaryOperator


