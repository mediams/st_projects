package my20241017home;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(Arrays.asList("eis", "sort", "ein", "eis", "kaktus"));
        List<String> list = new ArrayList<>(List.of("one", "two", "three"));
        list.add("-");

//        Iterator<String> iterator = list.iterator();
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            if (currentElement.equals("two")) {
                iterator.remove();
                iterator.add("TWO");
                System.out.println(currentElement);
            } else {
                System.out.println(currentElement);
            }
        }
        System.out.println(list);

        List<List<Integer>> listofstring = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        listofstring.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        listofstring.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(7);
        listofstring.add(list3);

        Iterator<List<Integer>> iterator1 = listofstring.iterator();
        int sum = 0;
        while (iterator1.hasNext()) {
            List<Integer> currentList = iterator1.next();
            for (int element : currentList) {
                if (element % 2 == 0) {
                    System.out.print(element + " ");
                }
                sum += element;
            }
        }
        System.out.println("\n" + sum);

        System.out.println(listofstring.get(0).get(1));

    }


}
//Создать список из 5 строковых значений и вывести их на экран с помощью Iterator.
//Создать двумерный массив целых чисел, заполнить его значениями и вывести сумму всех элементов.
//Создать вложенный список (List<List<Integer>>), добавить несколько списков и вывести определённый элемент.
//Использовать ListIterator для перебора списка слов и заменить одно из слов на другое.
//Создать список чисел, используя Iterator, вывести только чётные числа.
