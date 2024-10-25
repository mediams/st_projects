package TEST;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("Test", "Rot", "Gorg", "Ya", "Boba", "Grob"));

        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item("One", "First item"));
        items.add(new Item("Two", "Second item"));
        items.add(new Item("Three", "Third item"));

        LinkedList<Integer> listNum = new LinkedList<>(List.of(1, 4, 3, 2, 1, 2, 2, 0));

        searchShort(list); //Перебрать LinkedList и найти самую короткую строку.

        toOneString(list); //Перебрать LinkedList и объединить все строки в одну с использованием разделителя "|".

        deleteItem(items, "Third item");//Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.




    }

    private static void deleteItem(LinkedList<Item> items, String userSearch) {
        System.out.println("До удаления: \t" + items);

        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item i = iterator.next();
            if (i.getName().equals(userSearch) || i.getDescription().equals(userSearch)) {
                iterator.remove();
            }
        }
        System.out.println("После удаления:\t" + items);
    }

    private static void toOneString(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        StringBuilder temp = new StringBuilder("");
        while (iterator.hasNext()) {
            temp.append(iterator.next() + " | ");
        }
        System.out.println("Обьедененные строки: " + temp);
    }

    private static void searchShort(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        String temp = list.get(0);
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (temp.length() > s.length()) {
                temp = s;
            }
        }
        System.out.println("Самая короткая строка: " + temp);
    }
}
