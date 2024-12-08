package my20241112class.functionalinterfaces;

import java.util.function.BinaryOperator;

public class ProcessStrings {
    public static void main(String[] args) {
        StringProcessor toUpperCase = s -> s.toUpperCase();

        String result = toUpperCase.process("Input");
        System.out.println(result);

        StringProcessor limit = s -> s.substring(0, 5);
        result = limit.process("Hello World!");
        System.out.println(result);

        StringProcessor addDots = s -> "..." + s + "...";
        result = addDots.process("test");
        System.out.println(result);

        TwoStringProcessor concat = (s1, s2) -> s1 + "|" + s2;
        result = concat.process("One", "Two");
        System.out.println(result);

        //void -> void
        //data -> void ---- Consumer
        //void -> data ---- Supplier
        //data -> data2 ---- Function - Operator
        //(data2, data2) -> data3 ---- BiFunction - BinaryOperator
        BinaryOperator<String> concatOperator = (s1, s2) -> s1 + "||" + s2;// es gibt ein link
        result = concatOperator.apply("A", "B");
        System.out.println(result);

        result = ((BinaryOperator<String>)((s1, s2)-> s1 + "*" + s2)).apply("C","D"); // kein link
        System.out.println(result);

    }

    interface TwoStringProcessor{
        String process(String first, String second);
    }
}
