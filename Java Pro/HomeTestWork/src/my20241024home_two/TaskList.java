package my20241024home_two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskList {
    public static void main(String[] args) {
        List<Task> linkedList = new LinkedList<>();
        List<Task> arrayList = new ArrayList<>();

        String s = "Test";

        Task task = new Task("One T", "Jast first Task");
        Task task2 = new Task("Two T", "Jast second Task");
        Task task3 = new Task("Three T", s);

        linkedList.add(task);
        linkedList.add(task2);
        linkedList.add(task3);
        System.out.println(linkedList);
        System.out.println();
        arrayList.add(task);
        arrayList.add(task2);
        System.out.println(arrayList);

        arrayList.remove(1);

        System.out.println(arrayList);

        Iterator<Task> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Task t = iterator.next();
            if (t.getDescription().equals(s)) {
                iterator.remove();
            }
        }
        System.out.println(linkedList);
    }
}

