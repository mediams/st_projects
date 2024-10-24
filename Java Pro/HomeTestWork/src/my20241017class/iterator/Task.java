package my20241017class.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 60));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }

        Iterator<Integer> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            Integer element = iterator2.next();
            if (element % 10 == 0) {
                iterator2.remove();
            }
        }
        System.out.println(list);


        List<Integer> ListTotal = new ArrayList<>();
        Iterator<Integer> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            Integer element = iterator3.next();
            int squares = element * element;
            ListTotal.add(squares);
        }
        System.out.println(ListTotal);
    }
}
//Дан список из числовых данных. С помощью итератора:
//        - Напечатать только четные числа из списка.
//        - Удалить из списка все числа, заканчивающиеся на 0.
//        - Составить список квадратов чисел.
