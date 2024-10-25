package my20241025summary;

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
}
