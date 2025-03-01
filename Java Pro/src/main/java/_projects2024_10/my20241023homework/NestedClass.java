package _projects2024_10.my20241023homework;

import java.util.ArrayList;
import java.util.List;

class OuterClass2 {
    // Статический вложенный класс
    static class StaticNestedClass {
        public void display() {
            System.out.println("Я статический вложенный класс");
        }
    }

    // Внутренний класс
    class InnerClass {
        public void display() {
            System.out.println("Я внутренний класс");
        }
    }

    // Метод, который использует анонимный класс
    public void createAnonymousClass() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Я анонимный класс, реализующий интерфейс Runnable");
            }
        };
        runnable.run();
    }

    // Метод для работы с коллекцией игрушек
    public void workWithToyCollection() {
        List<String> toyList = new ArrayList<>();
        toyList.add("Машинка");
        toyList.add("Кукла");
        toyList.add("Мяч");

        // Используем анонимный класс для сортировки и вывода
        toyList.sort((toy1, toy2) -> toy1.compareTo(toy2));
        toyList.forEach(toy -> System.out.println("Игрушка: " + toy));
    }

    public static void main(String[] args) {
        // Создаем экземпляр статического вложенного класса
        OuterClass2.StaticNestedClass staticNested = new OuterClass2.StaticNestedClass();
        staticNested.display();

        // Создаем экземпляр внутреннего класса
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.display();

        // Используем анонимный класс
        outer.createAnonymousClass();

        // Работа с коллекцией игрушек
        outer.workWithToyCollection();
    }
}
