package _projects2024_10.my20240928.homework;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", 1);
        Cat cat2 = new Cat("Vasya", 1);
        Box box1 = new Box(cat1);
        Box box2 = new Box(cat2);
        
        System.out.println(cat1.equals(cat2));
        System.out.println(box1.equals(box2));
    }
}
