package my20241002.inheritance;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
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
        if (this == another) {
            System.out.printf("%s is playing with her tail.\n", getName());
        } else if (another.getClass().getSimpleName().equals("Cat") ) {
            System.out.println("A dog barks at a cat.");
        }else System.out.printf("%s play with %s.\n", this.getName(), another.getName());
    }

}
