package my20241009;

import java.util.Arrays;

public class Student {
    private String name;
    private Subject[] subjects;
    private boolean isTeach;

    public Student(String name, Subject... subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void knows(Subject... subjects) {

    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
