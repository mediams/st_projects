package my20241109home;

import java.util.Map;

public class Tasks {
    public static void main(String[] args) {
        Map<String, Integer> category = Map.of(
                "One", 2,
                "Two", 4,
                "Three", 7

        );
        System.out.println(getSumValues(category));
    }
    private static int getSumValues(Map<String, Integer> category) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : category.entrySet()){
            sum+=entry.getValue();
        }
            return sum;
    }
}
//    Создайте метод, который принимает на вход Map<String, Integer>,
//    где ключ — это название категории, а значение — число.
//    Метод должен вернуть общую сумму всех значений в Map.
