package my20241120homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWorkEx {
    public static void main(String[] args) {
        System.out.println("Task 1 - С помощью стримов посчитать количество неповторяющихся слов в списке: ");

        List<String> stringListAsText = List.of("С помощью стримов посчитать количество неповторяющихся слов в списке " +
                "С помощью стримов посчитать количество людей с именем \'Tom\' в списке имен " +
                "Из списка имен вывести первые три по алфавиту, предпоследнее имя по алфавиту");
        int result = (int) stringListAsText.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .distinct().count();
        System.out.println(result);

        System.out.println("\nTask 2 - С помощью стримов посчитать количество людей с именем \"Tom\" в списке имен: ");
        List<String> stringList = List.of("Ivan", "Tom", "Bob", "Tom", "John", "Max", "Olga", "Yan", "Zara");
        System.out.println(stringList.stream()
                .filter(s -> s.equals("Tom"))
                .count());

        System.out.println("\nTask 3 - Из списка имен вывести первые три по алфавиту, предпоследнее имя по алфавиту");
        System.out.println(stringList.stream()
                .sorted()
                .limit(3).collect(Collectors.toList()));
        System.out.println(stringList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1).toList());

//        4 - Создать список из экземпляров класса Cat.
//        С помощью стримов:
        List<Cat> catList = List.of(
                new Cat("Rob", 2, "black", true),
                new Cat("Max", 3, "white", false),
                new Cat("Bibi", 1, "grey", true),
                new Cat("OLof", 9, "black", false),
                new Cat("Bob", 2, "grey", true)
        );
        System.out.println("\nTask 4 - вывести список голодных кошек старше 2 лет: ");
        catList.stream().filter(cat -> cat.isHungry).forEach(System.out::println);

        System.out.println("\n//        вывести список уникальных цветов кошек: ");
        catList.stream().map(cat -> cat.colour).distinct().forEach(System.out::println);

        System.out.println("\n//        вывести список имен кошек возраста 1 год: ");
        catList.stream().filter(cat -> cat.age == 1).map(cat -> cat.getName()).forEach(System.out::println);
    }
}
