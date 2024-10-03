package lesson20240924.inheritance;

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

}
