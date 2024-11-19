package my20241119class;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private int workingHoursInMonth;

    private List<Employee> listEmployees;

    public Employee(String name, String surname, int age, int workingHoursInMonth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingHoursInMonth = workingHoursInMonth;
    }

    public Employee() {
        fillEmployee();
    }

    private void fillEmployee() {
        listEmployees = new ArrayList<>();
        listEmployees.add(new Employee("Bob", "Smith", 25, 35));
        listEmployees.add(new Employee("John", "Ivanov", 22, 41));
        listEmployees.add(new Employee("Max", "Greev", 19, 37));
        listEmployees.add(new Employee("Max", "Greev", 19, 40));
        listEmployees.add(new Employee("Lily", "North", 17, 36));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingHoursInMonth() {
        return workingHoursInMonth;
    }

    public List<Employee> getListEmployees() {
        return listEmployees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", workingHoursInMonth=" + workingHoursInMonth +
                '}';
    }
}


