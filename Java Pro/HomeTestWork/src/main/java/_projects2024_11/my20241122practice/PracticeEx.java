package _projects2024_11.my20241122practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeEx {
    public static void main(String[] args) {
//        1. Имеется два списка элементов.
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
//
//        С помощью flatMap():
//        a). Получить все возможные значения сумм чисел из обоих списков
        List<Integer> listSum = list1.stream()
                .flatMap(num1 -> list2.stream().map(num2 -> num1 + num2))
//                .mapToInt(Integer::sum); ---------------
                .collect(Collectors.toList());
        System.out.println(listSum);

//        b). Получить все возможные комбинации пар чисел из обоих списков [1, 4] [2, 6]
        List<Integer[]> listArray = list1.stream()
                .flatMap(num3 -> list2.stream().map(num4 -> new Integer[]{num3, num4})).toList();
        listArray.forEach(integers -> System.out.println(Arrays.toString(integers)));
//                .mapToInt(Integer::sum); ---------------

        int sum = 7;
        System.out.println("//        с). Найти все пары чисел, сумма которых будет равна заданному значению sum");
        List<Integer[]> listArray3 = list1.stream()
                .flatMap(num1 -> list2.stream()
                        .filter(num2 -> num1 + num2 == sum)
                        .map(num2 -> new Integer[]{num1, num2}))
//                .filter(array -> array[0] + array[1] == sum)
                .toList();
        listArray3.forEach(integers -> System.out.println(Arrays.toString(integers)));


        Employee employee1 = new Employee("Tim", "Smith", 23, 40, true, "IT");
        Employee employee2 = new Employee("Jane", "Smith", 45, 30, false, "STOCK");
        Employee employee3 = new Employee("Inna", "Smith", 32, 20, true, "IT");
        Employee employee4 = new Employee("Mark", "Smith", 47, 40, false, "ACCOUNTING");
        Employee employee5 = new Employee("John", "Smith", 23, 40, true, "STOCK");
        Employee employee6 = new Employee("Nina", "Smith", 12, 20, false, "IT");
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);

//        С помощью коллекторов создать Map:


        System.out.println("        //        - <name / Employee>");
        Map<String, Employee> hungryCatsByName = employees.stream()
                .collect(Collectors.toMap(employee -> employee.getName(), employee -> employee)); // onhe duplicate
        System.out.println(hungryCatsByName);

        System.out.println("        //                - <age / количество>");
        Map<Integer, Integer> hungryCatsByName2 = employees.stream()
                .collect(Collectors.toMap(Employee::getAge, employee -> 1, Integer::sum)); //  duplicate
        System.out.println(hungryCatsByName2);

        System.out.println("//                - <age / список сотрудников>");
        Map<Integer, Employee> listEmployee = employees.stream()
                .collect(Collectors.toMap(Employee::getAge, employee -> employee, (t, t2) -> t)); // replace duplicate
        System.out.println(listEmployee);

        Map<Integer, List<Employee>> listEmployee2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(listEmployee2);

        System.out.println("//                - <isActive / количество>");
        Map<Boolean, Integer> listEmployeeIsActive = employees.stream()
                .collect(Collectors.toMap(Employee::isActive, employee -> 1, Integer::sum));
        System.out.println(listEmployeeIsActive);

        System.out.println("//                - <department / список сотрудников>");
        Map<String, List<Employee>> mapDepartmentCountEmployee = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(mapDepartmentCountEmployee);

        System.out.println("//                - <department / общая сумма рабочих часов>");
        Map<String, Integer> mapDepertmentWorkingHours =  employees.stream()
                .collect(Collectors.toMap(Employee::getDepartment, employee -> employee.getWorkingHoursInMonth(), Integer::sum));
        System.out.println(mapDepertmentWorkingHours);

    }
}
