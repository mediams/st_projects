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
        if (this == another) {
            System.out.printf("%s is playing with her tail.\n", getName());
        } else if (another.getClass().getSimpleName().equals("Dog") ) {
            System.out.println("The cat's running away from the dog.");
        }else System.out.printf("%s play with %s.\n", this.getName(), another.getName());
    }

}
