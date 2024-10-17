package my20240928;

import java.util.Objects;

public class Equals {
    int age;
    String name;

    public Equals(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equals equals = (Equals) o;
        return age == equals.age && Objects.equals(name, equals.name);
    }
}
