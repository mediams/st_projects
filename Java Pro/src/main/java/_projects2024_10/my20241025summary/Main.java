package _projects2024_10.my20241025summary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listArray = new ArrayList<>();
        List<Integer> listLinked = new LinkedList<>();
        int m = 10000;
        Random random = new Random(m);

        System.out.println("//Создать списки ArrayList, LinkedList, заполнить тестовыми данными.");
        System.out.println("//Замерить время перебора данных в цикле fori, foreach и с применением итератора.");

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


        System.out.println("//--Создать класс Student с полями name, surname. Отсорировать список студентов по фамилии и имени.");

        Student student1 = new Student("Max", "Igorev");
        Student student2 = new Student("Bob", "Alekseev");
        Student student3 = new Student("Andrey", "Smith");
        List<Student> listStudents = new ArrayList<>(List.of(student1, student2, student3));

//        Collections.sort(listStudents);
        Collections.sort(listStudents, Student.nameComparator);
        System.out.println(listStudents);

        Collections.sort(listStudents, Student.surnameComparator);
        System.out.println(listStudents);

        /**
         * 3. Создать класс DataStorage с полями
         *     Data data;
         * 	Double weight;
         *     int version;
         * 	boolean isActive;
         * Где Data - класс с полями String data, int count.
         * Отсортировать список DataStorage с учетом всех параметров.
         */

        DataItem dataItem1 = new DataItem("PC", 21);
        DataItem dataItem2 = new DataItem("Laptop", 17);

        DataItem dataItem3 = new DataItem("Laptop", 16);
        DataItem dataItem4 = new DataItem("Monitor", 27);
        DataStorage dataStorage1 = new DataStorage(dataItem1, 5.0, 1, true);
        DataStorage dataStorage2 = new DataStorage(dataItem3, 9.0, 3, false);
        DataStorage dataStorage3 = new DataStorage(dataItem2, 7.0, 12, true);
        DataStorage dataStorage4 = new DataStorage(dataItem4, 7.0, 12, true);

        List<DataStorage> dataStorageList = new ArrayList<>(List.of(dataStorage1, dataStorage2, dataStorage3, dataStorage4));
        dataStorageList.add(new DataStorage(new DataItem("Laptop", 18), 5.0, 1, true));
        dataStorageList.add(new DataStorage(new DataItem("Laptop", 18), 5.0, 1, true));
        dataStorageList.add(new DataStorage(new DataItem("Laptop", 18), 1.0, 2, true));
        dataStorageList.add(new DataStorage(new DataItem("Laptop", 18), 1.0, 2, false));
        dataStorageList.add(new DataStorage(new DataItem("Laptop", 18), 1.0, 1, true));

        Collections.sort(dataStorageList);
        System.out.println(dataStorageList);
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
