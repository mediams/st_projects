package my20250118home.reflection.tasks.inheritance;

import lesson20240924.inheritance.interfaces.Walkable;

public class Human extends Creature implements Walkable {

    public Human(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Hello! I'm human. My name is " + super.getName());
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
    public void walk(Animal animal) {
        System.out.println("Human walks with " + animal.getName());
        animal.setHungry(true);
    }

}
