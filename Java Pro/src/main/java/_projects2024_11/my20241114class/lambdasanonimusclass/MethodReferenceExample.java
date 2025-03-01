package _projects2024_11.my20241114class.lambdasanonimusclass;

import java.util.function.Consumer;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Consumer<String> consumer = string -> System.out.println(string);
        consumer = System.out::println;
        consumer.accept("data");

        consumer = s -> staticMethod(s);
        consumer.accept("data");


        consumer = MethodReferenceExample::staticMethod;
        consumer.accept("T");

        MethodReferenceExample example = new MethodReferenceExample();
        consumer = MethodReferenceExample::nonStaticMethod;
        consumer.accept("data");

    }

    public static void staticMethod(String data) {
        System.out.println("StaticMethod " + data);

    }
    public static void nonStaticMethod(String data) {
        System.out.println("nonStaticMethod " + data);
    }
}
