package _projects2025_01.my20250118home.reflection.tasks.inheritance;

import _projects2024_10.my20241002.inheritance.Creature;

public abstract class Animal extends Creature {

    private int age;
    private boolean isHungry = true;

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public Animal(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + super.getName() + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }
}
