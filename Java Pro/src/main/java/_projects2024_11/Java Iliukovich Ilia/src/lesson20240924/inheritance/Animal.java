package lesson20240924.inheritance;

public class Animal {

    private String name;

    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello!" + " I'm animal" + " My name is " + name);
    }

}
