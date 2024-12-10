package my20241021homework;

public class Student {
    private String name;
    private String surname;

    public Student(String name, String surnmae) {
        this.name = name;
        this.surname = surnmae;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surnmae='" + surname + '\'' +
                '}';
    }

}
