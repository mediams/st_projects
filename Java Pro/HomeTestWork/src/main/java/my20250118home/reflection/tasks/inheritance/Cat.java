package my20250118home.reflection.tasks.inheritance;

import lesson20240924.inheritance.interfaces.CatchingSkills;

public class Cat extends Animal implements CatchingSkills {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("Meow!");
    }

    @Override
    public void introduce() {
        meow();
        System.out.println("Hello! I'm cat. My name is " + getName());
    }

    @Override
    public void play(Creature another) {
        if (another instanceof Dog) {
            System.out.println("Cat " + getName() + " runs away from " + another.getName());
        } else {
            super.play(another);
        }
    }

    @Override
    public void catchMouse() {
        System.out.println("Cat " + getName() + " caught a mouse");
    }
}
