package my20241021homework;

import my20241017class.customiterator.MyIterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<Student>> studentGrades = new ArrayList<>(); //1. Составить список списков студентов, распределенных по отдельным классам List> studentGrades
        List<Student> class1 = new ArrayList<>();
        class1.add(new Student("Ivan", "Ivanov"));
        class1.add(new Student("Mary", "Smith"));
        class1.add(new Student("Ivan", "Andreev"));

        List<Student> class2 = new ArrayList<>();
        class2.add(new Student("John", "Black"));
        class2.add(new Student("Mark", "Iotov"));
        class2.add(new Student("Ivan", "Fedorov"));

        studentGrades.add(class1);
        studentGrades.add(class2);

        System.out.println("Total count of students: " + countTotalAmount(studentGrades)); //Написать метод countTotalAmount(), который считает общее число студентов

        System.out.println("Found: " + countAmountWithName(studentGrades, "Ivan")); //Написать метод countAmountWithName(String name), который считает количество студентов в школе с заданным именем name.

        //-----------
        List names = new ArrayList<>(Arrays.asList(null, "Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));

        countNameWithFourBuchstaben(names);//a). Вывести имена, состоящие из 4 букв

        deleteNullAndEmpty(names);//b). Удалить из списка null и пустые строки.

    }

    private static void deleteNullAndEmpty(List names) {
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()){
            String current = listIterator.next();
            if (current == null || current.equals("")) {
                listIterator.remove();
            }
        }
        System.out.println(names);
    }

    private static void countNameWithFourBuchstaben(List names) {
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current == null) {
                continue;
            }
            if (current.length() == 4) {
                System.out.println(current);
            }
        }
    }

    private static int countAmountWithName(List<List<Student>> studentGrades, String name) {
        int count = 0;
        Iterator<List<Student>> iterator = studentGrades.iterator();
        while (iterator.hasNext()) {
            List<Student> currentClass = iterator.next();
            for (Student student : currentClass) {
                if (student.getName().equals(name)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int countTotalAmount(List<List<Student>> studentGrades) {
        int count = 0;
        Iterator<List<Student>> iterator = studentGrades.iterator();
        while (iterator.hasNext()) {
            List<Student> currentClass = iterator.next();
            count += currentClass.size();
        }
        return count;
    }
}
