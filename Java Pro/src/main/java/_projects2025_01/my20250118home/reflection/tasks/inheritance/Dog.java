package _projects2025_01.my20250118home.reflection.tasks.inheritance;

import _projects2024_10.my20241002.inheritance.Creature;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
        // some other code
    }

    public void gav() {
        System.out.println("Gav! Gav!");
    }

    @Override
    public void introduce() {
        gav();
        System.out.println("Hello! I'm dog. My name is " + getName());
    }

    @Override
    public void play(Creature another) {

    }



}
