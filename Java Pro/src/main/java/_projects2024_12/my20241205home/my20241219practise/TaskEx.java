package _projects2024_12.my20241205home.my20241219practise;

import java.util.ArrayList;
import java.util.List;

class TaskEx {
    public List<Integer> generateList() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            integerList.add(i);
        }
        return integerList;
    }
}

class TaskOne implements Runnable {
    private List<Integer> integerList;

    public List<Integer> getIntegerList() {
        return integerList;
    }

    @Override
    public void run() {
        TaskEx taskEx = new TaskEx();
        integerList = taskEx.generateList();

        for (int i = 0; i < integerList.size(); i++) {
            if (i % 2 != 0) {
                integerList.add(i);
            }
        }
    }
}

class TaskTwo implements Runnable {
    private List<Integer> integerList;

    public List<Integer> getIntegerList() {
        return integerList;
    }

    @Override
    public void run() {
        TaskEx taskEx = new TaskEx();
        integerList = taskEx.generateList();

        for (int i = 0; i < integerList.size(); i++) {
            if (i % 2 == 0) {
                integerList.add(i);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        TaskOne taskOneRunnable = new TaskOne();
        TaskTwo taskTwoRunnable = new TaskTwo();
        Thread taskOne = new Thread(taskOneRunnable);
        Thread taskTwo = new Thread(taskTwoRunnable);
        taskOne.start();
        taskTwo.start();

        try {
            taskOne.join();
            taskTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(taskOneRunnable.getIntegerList());
        System.out.println(taskTwoRunnable.getIntegerList());
    }
}
