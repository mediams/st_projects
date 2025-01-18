package my20250118home.reflection.tasks.inheritance;

import lesson20240924.inheritance.interfaces.CatchingSkills;
import lesson20240924.inheritance.interfaces.Walkable;

public class Robot extends Creature implements Walkable, CatchingSkills {

    private int id;

    private String version;

    public Robot(String name, int id, String version) {
        super(name);
        this.id = id;
        this.version = version;
    }

    @Override
    public void introduce() {
        System.out.println("Hi! I'm robot. My name is " + getName());
    }

    @Override
    public void walk(Animal animal) {
        System.out.println("Robot " + getName() + " walks with " + animal.getName());
        animal.setHungry(true);
    }

    @Override
    public void catchMouse() {
        System.out.println("Robot " + getName() + " caught a mouse");
    }
}
