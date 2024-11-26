package my20241125home;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx {
    public static void main(String[] args) {
        //        1. Имеется два списка элементов.
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
//
//        С помощью flatMap():
//        a). Получить все возможные значения сумм чисел из обоих списков
        List<Integer> listSum = list1.stream()
                .flatMap(num1 -> list2.stream().map(num2 -> num1 + num2)).toList();
        System.out.println(listSum);

//        b). Получить все возможные комбинации пар чисел из обоих списков [1, 4] [2, 6]
        List<Integer[]> listPaare = list1.stream()
                .flatMap(num1 -> list2.stream().map(num2 -> new Integer[]{num1, num2})).toList();
        listPaare.forEach(integers -> System.out.println(Arrays.toString(integers)));
    }
}
