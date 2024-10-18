package lesson20240924.inheritance;

public class House {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 2);
        Dog dog = new Dog("Maks", 1);

        cat.meow();
        dog.gav();

        cat.introduce();
        dog.introduce();
    }

}
