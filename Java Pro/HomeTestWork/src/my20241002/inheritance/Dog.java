package my20241002.inheritance;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
        // some other code
    }

    public String gav() {
        return "Gav! Gav!";
    }

    @Override
    public void introduce() {
        System.out.println(gav() + " I'm dog. My name is " + getName());
    }

    @Override
    public void play(Creature another) {

    }

}
