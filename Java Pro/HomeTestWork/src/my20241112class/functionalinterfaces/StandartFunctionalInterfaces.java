package my20241112class.functionalinterfaces;

import java.util.Random;
import java.util.function.*;

public class StandartFunctionalInterfaces {
    public static void main(String[] args) {
        Consumer<Integer> printData = integer -> System.out.println(integer);
        printData.accept(777);

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


