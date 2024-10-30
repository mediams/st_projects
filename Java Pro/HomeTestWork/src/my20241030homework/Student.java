package my20241030homework;

public class Student implements Comparable<Student> {
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
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        int result = name.compareTo(o.name);
        if (result != 0) {
            return result;
        }
        return surname.compareTo(o.surname);
    }
}
