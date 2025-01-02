package _projects2024_12.my20241205home.my20241208homeSerialzable;

import java.io.Serializable;

public class Person implements Serializable {
//    Создайте класс Person с полями name и age. Реализуйте интерфейс Serializable и сохраните объект этого класса в файл.
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
