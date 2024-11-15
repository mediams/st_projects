package my20241115summary;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CompositionEx {
    public static void main(String[] args) {
        Consumer<Integer>consumerMy = s-> System.out.println(s);
        Consumer <Integer> consumer = System.out::println;
        Consumer <Integer> consumer1 = System.err::println;
        Consumer<Integer> consumer2 = consumer.andThen(consumer1);

        consumer2.accept(1);
//        consumer2.accept(2);
//        consumer2.accept(3);
        consumerMy.accept(5);

        Predicate<String> isLong = s -> s.length() > 5;
        Predicate<String> startWithS = s -> s.startsWith(s);

        System.out.println(isLong.test("Hello"));
        System.out.println(startWithS.negate().test("Hello"));

        Predicate<String> compositePredicate = isLong.and(startWithS);
        System.out.println(compositePredicate.test("Hello world!"));

        Function<String, String> function = s-> s.toUpperCase();
        Function<String, String> functionEx = String::toUpperCase; // the same
        Function<String, String> function2 = s-> s.substring(0, 3);
        Function<String, String> function3 = s-> s + " additional Text.";

        System.out.println(function.andThen(function2).andThen(function3).apply("input"));
        System.out.println(function.compose(function2).compose(function3).apply("input"));
    }
}
