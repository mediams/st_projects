package my20241009.EnumSchool;

public class School {
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("Rob", Subject.MATHEMATICS);
        Teacher historyTeacher = new Teacher("Nina", Subject.HISTORY);
        Teacher englichTeacher = new Teacher("Polina", Subject.ENGLISH);

        Student student1 = new Student("Bart");
        Student student2 = new Student("Lisa");
        Student student3 = new Student("Max");

        Student[] students = {student1, student2, student3};

        mathTeacher.teach(student1);
        historyTeacher.teach(student3);
        System.out.println();
        mathTeacher.teach(students);
        System.out.println();
        englichTeacher.teach(students);
        System.out.println();

        for (Student student : students) {
            System.out.println(student.getName() + " know " + Subject.MATHEMATICS + " (" + student.knows(Subject.MATHEMATICS) + ")");
            System.out.println(student.getName() + " know " + Subject.HISTORY + " (" + student.knows(Subject.HISTORY) + ")");
            System.out.println(student.getName() + " know " + Subject.ENGLISH + " (" + student.knows(Subject.ENGLISH) + ")");
        }

        student1.printSubjects();
    }
}