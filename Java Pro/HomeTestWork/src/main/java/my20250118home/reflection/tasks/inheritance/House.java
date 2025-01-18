package my20250118home.reflection.tasks.inheritance;

public class House {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 2);
        Dog dog = new Dog("Maks", 1);

        cat.meow();
        dog.gav();

        cat.introduce();
        dog.introduce();

        Animal animal = new Dog("Dog", 2);
        animal.introduce();
        animal = new Cat("Cat", 1);
        animal.introduce();

        Human human = new Human("Peter");
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(animal);

        human.feedAnimals(cat, dog, animal);
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(animal);

        human.walk(dog);
        System.out.println(dog);

        human.play(cat);
        cat.play(dog);
        dog.play(cat);

        cat.play(animal);

//        cat.play(cat);

//        method();

        cat.catchMouse();

        Robot robot = new Robot("Vacuum cleaner", 1, "2.0");
        robot.introduce();
        robot.walk(cat);
        robot.catchMouse();
    }

    public static void method() {
        method();
    }

}
