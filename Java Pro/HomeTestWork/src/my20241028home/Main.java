package my20241028home;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//                Создайте LinkedList строк, затем реализуйте метод, который удалит все строки, содержащие определённое слово.
//        Пример: В списке ["apple", "banana", "apple pie", "cherry pie", "banana split"] удалите все строки, содержащие "pie".

        List<String> linkedList = new LinkedList<>(List.of("apple", "banana", "apple pie", "cherry pie", "banana split"));
        System.out.println(linkedList);

        Iterator <String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            String current = iterator.next();
            if (current.contains("pie")) {
                iterator.remove();
            }
        }
        System.out.println(linkedList);

//        Поиск уникальных элементов: Создайте ArrayList целых чисел и напишите метод, который возвращает список уникальных элементов (тех, которые встречаются только один раз).
//        Пример: [1, 2, 2, 3, 4, 4, 5] → [1, 3, 5].
        
    }
}
