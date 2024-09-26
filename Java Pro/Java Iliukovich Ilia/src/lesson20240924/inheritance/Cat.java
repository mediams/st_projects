package lesson20240924.inheritance;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("Meow!");
    }

    @Override
    public void introduce() {
        meow();
//        System.out.println("Hello! I'm cat");
        super.introduce();
    }

}
