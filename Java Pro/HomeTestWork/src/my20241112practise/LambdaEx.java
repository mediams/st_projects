package my20241112practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEx {
    public static void main(String[] args) {
        double result = new LambdaEx().doSmth((a, b) -> a + b, 10.0, 5.0);
        System.out.println(result);

        System.out.println(new LambdaEx().doSmth((a, b) -> a + b, 10.0, 5.0));
        System.out.println(new LambdaEx().doSmth((a, b) -> a - b, 10.0, 5.0));
        System.out.println(new LambdaEx().doSmth(Double::sum, 10.0, 5.0));
        System.out.println(new LambdaEx().doSmth(Double::max, 10.0, 5.0));

        List<String> strings = Arrays.asList("HELLO", "world", "JAVA", "functional");

//        System.out.println(filteredList(strings, s -> false);
    }

    public double doSmth(MyInterface myInterface, double a, double b) {
        return myInterface.calculate(a, b);
    }

    public static List<String> filteredList (List<String> strings, StringFilter stringFilter){
        List<String> result = new ArrayList<>();
        for (String s : strings){
            if(stringFilter.apply(s)){
                result.add(s);
            }

        }

        return result;
    }
}

@FunctionalInterface
interface MyInterface {
    double calculate(double a, double b);
}
//Где описываются методы где вызываются методы

//Для того чтобы я въехал в эту тему с лямбда Я хочу чтобы ты также показывал мне как это сделать без лямбда со лямбда


@FunctionalInterface
interface StringFilter {
    boolean apply(String s);
}
