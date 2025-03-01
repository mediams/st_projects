package _projects2024_11.my20241114class.lambdasanonimusclass;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LabmdaEx {
    public static void main(String[] args) {
        //void -- void

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello Supplier";
            }
        };

        process();

        Consumer<String> consumer = s -> process();
        consumer.accept("sbfbsfd");

        List<String> list = List.of("A", "B", "C", "D");
        list.forEach(e -> System.out.print(e));
        String delimiter = " | ";
        list.forEach(e -> {
            System.out.print(e + delimiter);
        });


    }

    private static void process() {
        System.out.println("Hello!");
    }
}
