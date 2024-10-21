package my20241021homework;

import my20241017class.customiterator.MyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Student>> studentGrades = new ArrayList<>();
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

        System.out.println("Total count of students: " + countTotalAmount(studentGrades));

        countAmountWithName(studentGrades, "Ivan");

    }

    private static void countAmountWithName(List<List<Student>> studentGrades, String name) {
        Iterator<List<Student>> iterator = studentGrades.iterator();
        while(iterator.hasNext()){

        }
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
//1. Составить список списков студентов, распределенных по отдельным классам List> studentGrades
//Написать метод countTotalAmount(), который считает общее число студентов
//Написать метод countAmountWithName(String name), который считает количество студентов в школе с заданным именем name.
//
//
//Имеется заданный список имен студентов:
//List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));
//С помощью итератора:
//a). Вывести имена, состоящие из 4 букв
//b). Удалить из списка null и пустые строки.
