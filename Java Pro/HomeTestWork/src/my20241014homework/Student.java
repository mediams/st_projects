package my20241014homework;

import java.util.Arrays;

public class Student {

    private String name;

    private Subject[] subjects;
//    private boolean[] ifKnowsSubject;

    public Student(String name) {
        this.name = name;
        subjects = new Subject[Subject.values().length];
    }

    public Student(String name, Subject[] subjects) {
        this.name = name;
        subjects = new Subject[Subject.values().length];
    }


    public void learn(Subject subject) {
        subjects[subject.ordinal()] = subject;
        System.out.println("Student " + name + " learns " + subject);
    }

    public boolean knows(Subject subject) {
        Subject subjectFromArray = subjects[subject.ordinal()];
        return subjectFromArray == subject;
    }

    public String getName() {
        return name;
    }

    public Student makeCopy() {
        Student student = new Student(this.name, this.subjects);
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
