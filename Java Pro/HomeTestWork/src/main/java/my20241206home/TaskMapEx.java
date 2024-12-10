package my20241206home;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskMapEx {
    public static void main(String[] args) {
//        Простое задание: Создайте Map из списка чисел, где ключом будет число, а значением его квадрат.
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (Integer i : integerList) {
            integerMap.put(i, i * i);
        }
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();


        Map<Integer, Integer> integerMapStream = new HashMap<>();
        integerMapStream = integerList.stream()
                .collect(Collectors.toMap(i -> i, i -> i * i));
        integerMapStream.forEach((key, value)->System.out.println("Key: " + key + ", Value: " + value));


//        Создайте Map из списка чисел, где ключ — число, а значение — сумма всех его вхождений.


    }
}
