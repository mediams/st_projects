package my20241126class;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Selbstarbeit {
    public static void main(String[] args) {
        Box box = new Box();

        box.put("Test");
        System.out.println(box);
        System.out.println(box.get());
        System.out.println(box.remove());
        System.out.println(box);

        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6,};
        List<Integer> list = makeList(array);
        System.out.println(list);

        String[] arrayString = new String[]{"one", "two"};
        List<String> listString = makeList(arrayString);
        System.out.println(listString);

//        makeArray()
    }

    public static <T> List<T> makeList(T[] t) {
        return Arrays.stream(t).collect(Collectors.toList());
    }
}
//1. Создать generic класс Box<Item>, в котором можно хранить предметы любого типа.
//Реализовать методы:
//        - put(Item item) - положить предмет
//       - get() - извлечь предмет
//      - remove() - извлечь и удалить предмет
//2. Написать generic метод makeList(), который преобразует массив в список.
//        3. Написать generic метод makeArray(), который преобразует список в массив.