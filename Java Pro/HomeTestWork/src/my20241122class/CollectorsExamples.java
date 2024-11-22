package my20241122class;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExamples {
    public static void main(String[] args) {
        // Дан список кошек
        Cat cat1 = new Cat("Tom", 2, "black", true);
        Cat cat2 = new Cat("Mikky", 1, "white", false);
        Cat cat3 = new Cat("Vasya", 3, "white", true);
        Cat cat4 = new Cat("Steve", 1, "grey", false);
        Cat cat5 = new Cat("Bob", 2, "black", true);
        Cat cat6 = new Cat("Vasya1", 5, "black", false);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6);
//
//1. Получить Map<String, Boolean> имя / информация, голодна ли кошка
        Map<String, Boolean> hungryCatsByName = catList.stream()
                .collect(Collectors.toMap(cat -> cat.getName(), cat -> cat.isHungry)); // onhe duplicate
        System.out.println(hungryCatsByName);

        Map<String, Boolean> hungryCatsByName2 = catList.stream()
                .collect(Collectors.toMap(Cat::getName, Cat::isHungry, (isHungry1, isHungry2) -> isHungry1 || isHungry2));
        System.out.println(hungryCatsByName2);
//2. Получить Map<String, Long> цвет / количество кошек данного цвета

        Map<String, Integer> catByColors = catList.stream().collect(Collectors.toMap(Cat::getColor, cat -> 1, Integer::sum));
        System.out.println(catByColors);

        Map<String, Long> catByColors2 = catList.stream().collect(Collectors.groupingBy(Cat::getColor, Collectors.counting()));
        System.out.println(catByColors2);
//3. Получить Map<String, Set<String>> цвет / список имен кошек данного цвета
//4. Получить Map<Integer, Integer> возраст / количество голодных кошек данного возраста


    }

    static class Cat {
        private String name;
        private int age;
        private String color;
        private boolean isHungry;

        public Cat(String name, int age, String color, boolean isHungry) {
            this.name = name;
            this.age = age;
            this.color = color;
            this.isHungry = isHungry;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isHungry() {
            return isHungry;
        }

        public void setHungry(boolean hungry) {
            isHungry = hungry;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", color='" + color + '\'' +
                    ", isHungry=" + isHungry +
                    '}';
        }
    }
}
