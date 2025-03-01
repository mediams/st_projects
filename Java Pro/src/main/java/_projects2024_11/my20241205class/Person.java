package _projects2024_11.my20241205class;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private Adress adress;

    public Person(String name, int age, Adress adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                '}';
    }
}
