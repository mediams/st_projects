package my20241002.inheritance;

public abstract class Animal extends Creature {

    private String name;
    private int age;
    private boolean isHungry = true;

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void introduce();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + this.getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }
}
