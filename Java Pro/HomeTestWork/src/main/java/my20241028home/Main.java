package my20241028home;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//                Создайте LinkedList строк, затем реализуйте метод, который удалит все строки, содержащие определённое слово.
//        Пример: В списке ["apple", "banana", "apple pie", "cherry pie", "banana split"] удалите все строки, содержащие "pie".

        List<String> linkedList = new LinkedList<>(List.of("apple", "banana", "apple pie", "cherry pie", "banana split"));
        System.out.println(linkedList);

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.contains("pie")) {
                iterator.remove();
            }
        }
        System.out.println(linkedList);

//        Поиск уникальных элементов: Создайте ArrayList целых чисел и напишите метод, который возвращает список уникальных элементов
//        (тех, которые встречаются только один раз).
//        Пример: [1, 2, 2, 3, 4, 4, 5] → [1, 3, 5].
        List<Integer> array = new ArrayList<>(List.of(5, 1, 2, 1, 2, 3, 4, 3, 4, 5));
        Collections.sort(array);
        List<Integer> newArray = new ArrayList<>();

        Iterator<Integer> iterator2 = array.iterator();
        int tempPrev = iterator2.next();
        while (iterator2.hasNext()) {
            int tempCur = iterator2.next();
            if (tempPrev != tempCur) {
                newArray.add(tempPrev);
            }
            tempPrev = tempCur;
        }
        System.out.println(newArray);

//        Создание и модификация списка объектов с условиями:
//        Создайте класс Product с полями name и price.
//        Заполните LinkedList объектами этого класса и
//        напишите метод, который увеличивает цену на 10% для всех продуктов с начальной ценой ниже 50.

        List<Product> productList = new LinkedList<>();
        productList.add(new Product("PC", 125));
        productList.add(new Product("Laptop", 105));
        productList.add(new Product("Monitor", 25));
        productList.add(new Product("USB", 15));

        Iterator<Product> iterator3 = productList.iterator();
        while (iterator3.hasNext()) {
            Product product = iterator3.next();
            if (product.getPrice() < 50) {
                double newPrice = Math.round(product.getPrice() * 1.1 * 100.0) / 100.0;
                product.setPrice(newPrice);
            }
        }
        System.out.println(productList);

//        Переворачивание списка: Создайте ArrayList строк,
//        затем реализуйте метод, который переворачивает порядок элементов в списке
//        (без использования встроенного метода Collections.reverse()).
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        ListIterator<Integer> integerIterator = integerList.listIterator(integerList.size());
        while (integerIterator.hasPrevious()) {
            System.out.println(integerIterator.previous());
        }

    }

    public static class Product {
        private String name;
        private double price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
