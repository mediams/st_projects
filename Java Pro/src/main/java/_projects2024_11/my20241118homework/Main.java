package _projects2024_11.my20241118homework;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        1. Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного исходного списка анекдотов.
        List<String> listJoke = List.of(
                "Почему программистам сложно дружить с детьми? Потому что они начинают считать с нуля, а дети с года.",
                "Программистов нельзя спрашивать о том, как дела. У них всегда три состояния: 1) всё работает; 2) не работает; 3) не могу воспроизвести баг.",
                "Программист объясняет жене: \"Я тут код пишу.\" Она отвечает: \"А почему тогда не печатаешь?\" Программист: \"Я пишу его мышкой!\"",
                "Программист подошел к зеркалу, задумался и говорит: \"Привет, а ты кто будешь?\" Зеркало отвечает: \"404. Эго не найдено.\"",
                "Почему программисты любят зиму? Потому что в двоичном формате она означает «Off»!"
        );

        Supplier<String> randomJoke = () -> {
            Random random = new Random();
            return listJoke.get(random.nextInt(listJoke.size()));
        };
        System.out.println(randomJoke.get());

//        2. Создать Consumer, который принимает числа и печатает четные числа в поток System.out, а нечетные числа в System.err.

        Consumer<Integer> checkIsEven = (num) -> {
            if (num % 2 == 0) {
                System.out.println("Even: " + num);
            } else System.err.println("Odd: " + num);
        };

        checkIsEven.accept(-1);

//        3. Создать три функции:
//        Составить композитную функцию так, чтобы:
//        Input:
//        777
//        Output:
//        8
//        Input:
//        "Hello!"
//        Output:
//        "<<60>>"

        System.out.println("//        f1 - умножает Integer на 10");
        UnaryOperator<Integer> multiply = (num) -> num * 10;
        System.out.println(multiply.apply(777));

        System.out.println("//        f2 - преобразует Integer в String в формате <<123>>");
        Function<Integer, String> toString = (num) -> {
            String str = "<<" + num + ">>";
            return str;
        };
        System.out.println(toString.apply(5));

        System.out.println("//        f3 - считает число символов в String");
        Function<String, Integer> lengthOfSring = (str) -> str.length();
        System.out.println(lengthOfSring.apply("Text"));

        System.out.println("//        а) функции выполнялись последовательно друг за другом f1 -> f2 -> f3");
        Function<Integer, Integer> andThen = multiply.andThen(toString.andThen(lengthOfSring));
        System.out.println(andThen.apply(777));

        System.out.println("//        б) в порядке f3 -> f1 -> f2");
        Function<String, String> compose = lengthOfSring.andThen(toString.compose(multiply));
        System.out.println(compose.apply("Hello!"));

//        4.Написать метод reduce(), который на вход принимает список чисел, оператор двух аргументов и начальное значение.
//        public static Integer reduce(List<Integer> list, BinaryOperator<Integer> operator, Integer basicValue)
//        Метод накапливает результат применения оператора по всем данных, начиная с начального значения.
//                Например, вызов


        List<Integer> listNumbers = List.of(1, 7, 3, 4);
        System.out.println("//        reduce(list, Integer::sum, 0)) должен вернуть сумму всех чисел");
        System.out.println(reduce(listNumbers, (x, y) -> x + y, 0));

        System.out.println("//        reduce(list, (i, j) -> i * j, 1) должен вернуть произведение всех чисел");
        System.out.println(reduce(listNumbers, (x, y) -> x * y, 1));

        System.out.println(reduce(listNumbers, (x, y) -> {
            if (x < y) {
                x = y;
            }
            return x;
        }, listNumbers.iterator().next())); // Integer.MIN_VALUE //Integer.max(x,y)

        System.out.println(reduce(listNumbers, (x, y) -> Integer.max(x, y), Integer.MIN_VALUE)); // Integer.MIN_VALUE //


    }

    public static Integer reduce(List<Integer> list, BinaryOperator<Integer> operator, Integer basicValue) {
        Integer result = basicValue;
        for (Integer number : list) {
            result = operator.apply(result, number);
        }
        return result;
    }
}
