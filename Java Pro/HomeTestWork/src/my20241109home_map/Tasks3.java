package my20241109home_map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tasks3 {
    public static void main(String[] args) {
        Map<String, Map<String, List<Integer>>> citesSubCategiryPrice = Map.of(
                "USA", Map.of(
                        "Food", List.of(23, 15, 24),
                        "Test 01", List.of(23, 15, 24),
                        "Test 02", List.of(23, 15, 24)
                ),
                "France", Map.of(
                        "Test 05", List.of(23, 15, 24),
                        "Test 06", List.of(23, 15, 24),
                        "Test 07", List.of(23, 15, 24)
                )

        );

        System.out.println(getSomeValues(citesSubCategiryPrice));
    }

    private static Map<String, Integer> getSomeValues(Map<String, Map<String, List<Integer>>> citesSubCategiryPrice) {
        Map<String, Integer> list = new HashMap<>();

        for (Map.Entry<String, Map<String, List<Integer>>> entry : citesSubCategiryPrice.entrySet()) {
            String name = entry.getKey();
            Map<String, List<Integer>> subLIst = entry.getValue();

            int totalCount = 0;
            for (List<Integer> listNew : subLIst.values()) {
                totalCount += listNew.size();
            }

            list.put(name, totalCount);
        }


        return list;
    }
}
//        Создайте метод, который принимает на вход Map<String, Map<String, List<Integer>>>,
//        где ключ — страна, вложенный Map — подкатегории (например, продукты и электроника),
//        а значения — это списки цен.
//        Метод должен вернуть Map<String, Integer>, где ключ — это название страны,
//        а значение — общее количество элементов в списках всех подкатегорий.