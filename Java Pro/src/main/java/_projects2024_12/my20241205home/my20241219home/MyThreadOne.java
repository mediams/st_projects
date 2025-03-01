package _projects2024_12.my20241205home.my20241219home;

import java.util.ArrayList;
import java.util.List;

public class MyThreadOne implements Runnable {
    List<Integer> integerList = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                integerList.add(i);
                System.out.println("Thread-1: " + i);
            }
        }
        System.out.println(integerList);
    }
}
