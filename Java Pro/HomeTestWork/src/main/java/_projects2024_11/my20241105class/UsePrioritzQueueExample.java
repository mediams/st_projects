package _projects2024_11.my20241105class;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class UsePrioritzQueueExample {
    static class ProjectManger {
        Queue<Task> queue;
        int i = 0;


        public ProjectManger(Queue<Task> queue) {
            this.queue = queue;
        }

        public void giveTask() {
            Random random = new Random();
            Task task = new Task("Task" + i++, random.nextInt(10));
            queue.add(task);
            System.out.println("Task is given.");
        }
    }

    static class Programmer {
        Queue<Task> queue;
        String name;

        public Programmer(Queue<Task> queue, String name) {
            this.queue = queue;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Programmer{" +
                    "queue=" + queue +
                    '}';
        }

        public void doTask(){
//            if (!queue.isEmpty()){
//                Task task= queue.poll();
//                System.out.println(this + "doing task" + task);
//            } else System.out.println("No tasks.txt!");

            if (!queue.isEmpty()) {
                Task task = queue.poll(); // Берем задачу из очереди
                System.out.println(this.name + " is doing task: " + task);
            } else {
                System.out.println(this.name + " found no tasks.txt to do!");
            }
        }
    }

    static class Task implements Comparable<Task> {
        String name;
        int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task o) {
            return Integer.compare(o.priority, this.priority);
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", priority=" + priority +
                    '}';
        }
    }

    public static void main(String[] args) {
        Queue<Task> tasks = new PriorityQueue<>();
        ProjectManger projectManger = new ProjectManger(tasks);
        Programmer programmer1 = new Programmer(tasks, "programmer1");
        Programmer programmer2 = new Programmer(tasks, "programmer2");

        projectManger.giveTask();
        projectManger.giveTask();
        projectManger.giveTask();
        projectManger.giveTask();
        projectManger.giveTask();

        while (!tasks.isEmpty()){
            programmer1.doTask();
            programmer2.doTask();
        }
    }
    //ProjectManger --> Task ( name, priority)
    // Programmer1, Programmer2


}
