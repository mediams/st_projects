package my20241025summary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listArray = new ArrayList<>();
        List<Integer> listLinked = new LinkedList<>();
        int m = 100000;
        Random random = new Random(m);

        extracted(m, random, listLinked, listArray); //заполняем оба массива
        extracted(m, listArray); //Time for ArrayList (fori)
        long end;
        long start;
        int sum;
        extracted1(m, listLinked); //Time for LinkedList (fori)
        // for each
        extracted(listArray);//Time for ArrayList (for each)
        extracted1(listLinked);//Time for LinkedList (for each)

        //iterator
        extracted2(listArray);//Time for ArrayList (iterator)
        extracted3(listLinked);//Time for LinkedList (iterator)


        //--Создать класс Student с полями name, surname. Отсорировать список студентов по фамилии и имени.

        Student student1 = new Student("Max", "Igorev");
        Student student2 = new Student("Bob", "Alekseev");
        Student student3 = new Student("Andrey", "Smith");
        List<Student> listStudents = new ArrayList<>(List.of(student1, student2, student3));

        Student.
        System.out.println(listStudents);
    }

    private static void extracted3(List<Integer> listLinked) {
        int sum;
        long end;
        long start;
        start = System.currentTimeMillis();
        sum = 0;
        Iterator<Integer> iterator2 = listLinked.iterator();
        while (iterator2.hasNext()) {
            int i = iterator2.next();
            sum += i;
        }
        end = System.currentTimeMillis();
        System.out.println("Time for LinkedList (iterator) elapsed: " + (end - start));
    }

    private static void extracted2(List<Integer> listArray) {
        long end;
        long start;
        int sum;
        start = System.currentTimeMillis();
        sum = 0;
        Iterator<Integer> iterator = listArray.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            sum += i;
        }
        end = System.currentTimeMillis();
        System.out.println("Time for ArrayList (iterator) elapsed: " + (end - start));
    }

    private static void extracted1(List<Integer> listLinked) {
        long end;
        int sum;
        long start;
        start = System.currentTimeMillis();
        sum = 0;
        for (Integer i : listLinked) {
            sum += i;
        }
        end = System.currentTimeMillis();
        System.out.println("Time for LinkedList (for each) elapsed: " + (end - start));
    }

    private static void extracted(List<Integer> listArray) {
        long end;
        int sum;
        long start;
        start = System.currentTimeMillis();
        sum = 0;
        for (Integer i : listArray) {
            sum += i;
        }
        end = System.currentTimeMillis();
        System.out.println("Time for ArrayList (for each) elapsed: " + (end - start));
    }

    private static void extracted1(int m, List<Integer> listLinked) {
        int sum;
        long start;
        long end;
        start = System.currentTimeMillis(); // O(n^2)
        sum = 0;
        for (int i = 0; i < m; i++) {
            sum += listLinked.get(i);
        }

        end = System.currentTimeMillis();
        System.out.println("Time for LinkedList (fori) elapsed: " + (end - start));
    }

    private static void extracted(int m, List<Integer> listArray) {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += listArray.get(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time for ArrayList (fori) elapsed: " + (end - start));
    }

    private static void extracted(int m, Random random, List<Integer> listLinked, List<Integer> listArray) {
        for (int i = 0; i < m; i++) {
            int num = random.nextInt();
            listLinked.add(num);
            listArray.add(num);
        }
    }
}
