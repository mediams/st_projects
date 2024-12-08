package my20241024homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("Test", "Rot", "Gorg", "Ya", "Boba", "Grob"));

        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item("One", "First item"));
        items.add(new Item("Two", "Second item"));
        items.add(new Item("Three", "Third item"));

        System.out.println("\nПеребрать LinkedList и найти самую короткую строку:");
        searchShort(list);

        System.out.println("\nПеребрать LinkedList и объединить все строки в одну с использованием разделителя \"|\".");
        toOneString(list);

        System.out.println("\nСоздать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.");
        deleteItem(items, "Third item");

        System.out.println("\nполучить первое и последнее вхождение указанных элементов в связанном списке.");
        List<Integer> integerList = new LinkedList<>(List.of(1, 4, 3, 2, 1, 2, 2, 0));
        int element = 2;
        searchLastAndFirstElement(integerList, element);
    }

    private static void searchLastAndFirstElement(List<Integer> integerList, int element) {
        System.out.println("integerList = " + integerList);
        ListIterator<Integer> listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            int i = listIterator.next();
            if (i == element) {
                System.out.println("Индекс первого вхождения: " + listIterator.previousIndex());
                break;
            }
        }

//        if (hasElement == false) System.out.printf("Индекс вхождения '%d' не найден!", element);
        ListIterator<Integer> listIteratorReverse = integerList.listIterator(integerList.size());
        while (listIteratorReverse.hasPrevious()) {
            int i = listIteratorReverse.previous();
            if (i == element) {
                System.out.println("Индекс последнего вхождения: " + listIteratorReverse.nextIndex());
                break;
            }
        }
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
