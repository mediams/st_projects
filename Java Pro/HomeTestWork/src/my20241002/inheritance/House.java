package my20241002.inheritance;

public class House {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 2);
        Dog dog = new Dog("Maks", 1);
        Dog dog2 = new Dog("Rex", 3);

        cat.introduce();
        dog.introduce();
        System.out.println(cat);
        System.out.println(dog);

        System.out.println();
        Human human = new Human("Peter");
        human.introduce();

        System.out.println();
        human.feedAnimals(cat, dog, dog2);

        System.out.println();
        human.walkAnimal(cat);

        System.out.println();
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(dog2);

        System.out.println();
        human.play(cat);

    }

}
