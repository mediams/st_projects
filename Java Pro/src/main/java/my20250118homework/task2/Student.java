package my20250118homework.task2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Student {
    String name;
    String surname;
    int groupNumber;
    boolean isOnline;

    public Student(String name, String surname, int groupNumber, boolean isOnline) {
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.isOnline = isOnline;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                ", isOnline=" + isOnline +
                '}';
    }

}
