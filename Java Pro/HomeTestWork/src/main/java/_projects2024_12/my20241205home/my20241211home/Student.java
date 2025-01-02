package _projects2024_12.my20241205home.my20241211home;

import _projects2024_10.my20241024practise.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Comparator;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparator<Student> {
    private String name;
    private double grade;

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getGrade(), o1.getGrade());
    }
}
