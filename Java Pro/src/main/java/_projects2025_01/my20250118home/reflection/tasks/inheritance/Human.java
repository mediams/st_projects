package _projects2025_01.my20250118home.reflection.tasks.inheritance;


import _projects2024_10.my20241002.inheritance.Animal;
import _projects2024_10.my20241002.inheritance.Creature;
import _projects2024_10.my20241002.inheritance.Walkable;

public class Human extends Creature implements Walkable {

    public Human(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Hello! I'm human. My name is " + super.getName());
    }

    @Override
    public void play(Creature another) {

    }

    public void feedAnimal(Animal animal) {
        animal.setHungry(false);
        System.out.println("Animal " + animal.getName() + " is not hungry anymore");
    }

    public void feedAnimals(Animal... animals) {
        for (Animal a : animals) {
            feedAnimal(a);
        }
    }



    @Override
    public void walk(_projects2024_10.my20241002.inheritance.Animal animal) {

    }
}
