package my20241002.inheritance;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public String meow() {
        return "Meow!";
    }

    @Override
    public void introduce() {
        System.out.println(meow() + " I'm cat. My name is " + getName());
    }

    @Override
    public void play(Creature another) {

    }

}
