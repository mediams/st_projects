package _projects2024_11.my20241121practise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks {
    public static void main(String[] args) {
        List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(sumOfSquaresOfOddNumbers(listNumbers));

        List<String> listStrings = List.of("One", "Two", "Three", "Three");
        System.out.println(uniqueSortedWords(listStrings));

        System.out.println(longestString(listStrings));

        System.out.println(uniqueChars(listStrings));

//        System.out.println(uniqueChars2(listStrings));
    }

    //Напишите метод, который принимает список чисел и возвращает
    // сумму квадратов всех нечетных чисел в списке.
    public static int sumOfSquaresOfOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(s -> s % 2 != 0)
                .reduce(((integer, integer2) -> integer + integer2 * integer2)).get();
    }

    //Напишите метод, который принимает список строк и возвращает список уникальных слов,
    // отсортированных в лексикографическом порядке.
    public static List<String> uniqueSortedWords(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted().toList();
    }

    //Напишите метод, который принимает список строк и возвращает самую длинную строку в списке.
    public static String longestString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(String::length)).get();
    }

    //Напишите метод, который принимает список строк и возвращает список строк, содержащих
    // только уникальные символы (т.е. символы, которые не повторяются в строке).
    public static List<String> uniqueChars(List<String> strings) {
        return strings.stream()
                .flatMap(s -> s.chars()
                        .mapToObj(value -> value))
                .map(c -> Character.toString(c))
                .distinct().toList();
    }

//    public static List<String> uniqueChars2(List<String> strings) {
//        return strings.stream()
//                .map(str -> str.chars()
//                        .mapToObj(c -> (char) c)
//                        .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
//                        .map(String::valueOf)
//                        .collect(Collectors.toList()).;
//    }


}
