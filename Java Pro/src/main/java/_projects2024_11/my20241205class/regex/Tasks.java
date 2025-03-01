package _projects2024_11.my20241205class.regex;

import java.util.regex.Pattern;

public class Tasks {
    public static void main(String[] args) {
//        1) Напишите регулярное выражение, которое соответствует пин-коду из 4 чисел.
//        2) Напишите регулярное выражение, которое соответствует именам клавиш F1-F12.
//        3) Напишите регулярное выражение, которое соответствует URL-адресу сайта вида https://someaddress.someending

        System.out.println(Pattern.matches("\\d{4}", "1234")); // пин-коду из 4 чисел.
        System.out.println(Pattern.matches("[F][1-9]|[F]1[0-2]", "F1")); // регулярное выражение, которое соответствует именам клавиш F1-F12


    }
}
