package my20241030homework;

import my20241029class.Book;

import java.util.*;

public class UniEx {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Tom", "Smith"));
        studentList.add(new Student("Max", "Matveev"));
        studentList.add(new Student("Maria", "Obama"));
        studentList.add(new Student("Anna", "Trump"));
        studentList.add(new Student("Anna", "Smith"));
        studentList.add(new Student("Anna", "Abrek"));
        studentList.add(new Student("Yan", "Klinton"));
        studentList.add(new Student("Ivonn", "Abrek"));
        studentList.add(new Student("Ivonn", "Abrek"));

        System.out.println("\n//        Original list: ");
        System.out.println(studentList);

        System.out.println("\n//        Comparable (natural ordering)");
        Collections.sort(studentList);
        System.out.println(studentList);

        System.out.println("\n//        Shuffle list: ");
        Collections.shuffle(studentList);
        System.out.println(studentList);

        System.out.println("\n//        Sort by Name: ");
        sortStudentListByName(studentList);
        System.out.println(studentList);

        System.out.println("\n//        Sort by SurName: ");
        Collections.sort(studentList, new studentComparatorBySurname());
        System.out.println(studentList);

        TreeSet<Student> studentTreeSet = new TreeSet<>(studentList);
        System.out.println(studentTreeSet);
    }

    private static void sortStudentListByName(List<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public static class studentComparatorBySurname implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    }

}
