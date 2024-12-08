package summary20240927.equals;

public class Employee {

    private Integer id;
    private String name;
    private String surname;
    private Integer age;

    public Employee(Integer id, String name, String surname, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object another) {
        if (another == null || another.getClass() != Employee.class) {
            return false;
        }
        Employee anotherEmployee = (Employee) another;
        return id != null && id.equals(anotherEmployee.id);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Tom", "Smiths", 20);
        Employee employee2 = new Employee(2, "Tom", "Smiths", 20);
        System.out.println(employee1.equals(employee2));
    }


}
