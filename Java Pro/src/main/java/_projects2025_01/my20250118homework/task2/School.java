package my20250118homework.task2;


public class School {
    @StudentInfo(name = "Tom", surname = "Smith", groupNumber = 1101, isOnline = true)
    private Student student1;


    @StudentInfo(name = "Mary", surname = "Jennings", groupNumber = 1102, isOnline = false)
    private Student student2;

    @Override
    public String toString() {
        return "School{" +
                "student1=" + student1 +
                ", student2=" + student2 +
                '}';
    }
}
