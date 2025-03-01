package _projects2024_11.my20241107practise;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Set<Integer>> map = Map.of(
                "C1", Set.of(1, 2, 3, 4),
                "C2", Set.of(9, 8, 7, 6));

        int sum = 0;
        for (Set<Integer> set : map.values()) {
            for (int num : set) {
                sum += num;
            }
        }
        System.out.println(sum);

        Map<String, Set<String>> data = Map.of(
                "City1", Set.of("Alice", "Bob"),
                "City2", Set.of("Alice", "Charlie"),
                "City3", Set.of("Bob", "David")
        );

        Set<String> uniqueName = new HashSet<>();
        for (Set<String> value : data.values()) {
            for (String list : value) {
                uniqueName.add(list);
            }
        }
        System.out.println(uniqueName);

        Map<String, Map<String, List<Integer>>> dataNew = Map.of(
                "Country1", Map.of(
                        "Electronics", List.of(5, 8, 7),
                        "Clothing", List.of(6, 9)
                ),
                "Country2", Map.of(
                        "Food", List.of(3, 4),
                        "Electronics", List.of(8, 8, 9)
                )
        );

        for (Map<String, List<Integer>> value : dataNew.values()) {
            for (List<Integer> integerList : value.values()) {
                int sumNew = 0;
                for (int numNew : integerList) {
                    sumNew += numNew;
                }
                System.out.println(sumNew);
            }
        }

        Map<String, Map<String, String>> employees = Map.of(
                "1", Map.of("Имя", "Alice", "Отдел", "IT"),
                "2", Map.of("Имя", "Bob", "Отдел", "HR"),
                "3", Map.of("Имя", "Charlie", "Отдел", "IT")
        );
        String nameOfDepartment = "IT";
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Map<String, String>> entry : employees.entrySet()) {
            System.out.println(entry);
            Map<String, String> entry2 = entry.getValue();
//            System.out.println(entry);
            if (entry2.get("Отдел") == nameOfDepartment) {
                System.out.println(entry2.get("Имя"));
                list.add(entry.getKey() + ": " + entry2.get("Имя"));
            }
        }
        System.out.println(list);
    }
}

//    Напишите метод, который принимает на вход название отдела и возвращает список ID сотрудников из этого отдела.

