package my20241219home;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Thread taskOne = new Thread(new MyThreadOne());
        taskOne.start();

        Thread taskTwo = new Thread(new MyThreadTwo());
        taskTwo.start();

//        List<Integer> integerList = new ArrayList<>(taskOne.start());
    }
}
