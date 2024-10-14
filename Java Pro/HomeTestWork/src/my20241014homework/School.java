package my20241014homework;

import java.util.Arrays;

public class School {

    public static void main(String[] args) {
        Subject subject = Subject.MATH;
        System.out.println(Subject.LITERATURE == subject);

        Teacher teacher1 = new Teacher("Mr. Smith", Subject.MATH);
        Teacher teacher2 = new Teacher("Mrs. Smith", Subject.HISTORY);

        Student student1 = new Student("Tom");
        Student student2 = new Student("Mary");
        Student student3 = new Student("Lucy");
        Student[] group = {student1, student2, student3};

        teacher1.teach(student1);
        teacher2.teach(group);

        System.out.println("+" + Arrays.toString(group));

        System.out.println(student1.knows(Subject.HISTORY));
        System.out.println(student1.knows(Subject.MATH));
        System.out.println(student1.knows(Subject.LITERATURE));

        System.out.println("-");
        Student student = student2.makeCopy();
        System.out.println(student);
    }

}
