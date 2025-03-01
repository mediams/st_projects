package _projects2024_11.my20241109home_map;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Set<String>> citesAndPeople = Map.of(
                "New York", Set.of("John", "Stive", "Mark"),
                "Los Angeles", Set.of("Jane", "Alice", "Linda"),
                "Chicago", Set.of("Alice", "Bob", "John")
        );

        System.out.println(getUniqueNames(citesAndPeople));
    }

    private static Set<String> getUniqueNames(Map<String, Set<String>> citesAndPeople) {
        Set<String> uniqueNams = new HashSet<>();
        for (Set<String> names : citesAndPeople.values()) {
            for (String s : names) {
                uniqueNams.add(s);
            }
        }
        return uniqueNams;
    }
}
//        Создайте метод, который принимает на вход Map<String, Set<String>>,
//        где ключ — название города, а значение — список уникальных имён людей, живущих в этом городе.
//        Метод должен вернуть Set<String> со всеми уникальными именами из всех городов./
