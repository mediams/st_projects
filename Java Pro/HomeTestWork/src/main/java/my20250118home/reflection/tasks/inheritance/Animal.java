package my20250118home.reflection.tasks.inheritance;

public abstract class Animal {

    private int age;

    private boolean isHungry = true;

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public Animal(String name, int age) {
        this.name = name;
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
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }
}
