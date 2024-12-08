package my20241025summary;

import java.util.Comparator;

public class Student implements Comparable <Student> {
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    public static Comparator <Student> nameComparator = new Comparator <Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.getName());
        }
    };

    public static Comparator<Student> surnameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.surname.compareTo(o2.getSurname());
        }
    };

    public static Comparator<Student> namesComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return 0;
        }
    };

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
