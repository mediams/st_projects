package my20241215home;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Person {
    @Getter
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
