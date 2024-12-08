package my20241014homework;

public class Teacher {

    private String name;

    private Subject subject;

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach(Student student) {
        System.out.println("Teacher " + name + " teaches " + student.getName());
        student.learn(subject);
    }

    public void teach(Student[] students) {
        for (Student student : students) {
            teach(student);
        }
    }

}
