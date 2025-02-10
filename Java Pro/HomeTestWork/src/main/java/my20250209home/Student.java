package my20250209home;

public class Student {
    private int id = 1;
    private String name = "Student";
    private int age = 10;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
