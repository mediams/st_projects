package my20241217practise;

import java.util.ArrayList;
import java.util.List;

public class ThreadEx {
    public List<Integer> generateLIst() {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            integerList.add(1);
        }
        return integerList;
    }
}

class PartOne extends Thread {
    static int sum = 0;

    @Override
    public void run() {
        ThreadEx threadEx = new ThreadEx();
        List<Integer> integerList = threadEx.generateLIst();
        for (int i = 0; i < integerList.size() / 2; i++) {
            sum += integerList.get(i);
        }
    }
}

class PartTwo extends Thread {
    static int sum = 0;

    @Override
    public void run() {
        ThreadEx threadEx = new ThreadEx();
        List<Integer> integerList = threadEx.generateLIst();
        for (int i = integerList.size() / 2; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        PartOne partOne = new PartOne();
        partOne.start();
        PartTwo partTwo = new PartTwo();
        partTwo.start();

        partOne.join();
        partTwo.join();

        System.out.println(PartTwo.sum + PartOne.sum);
    }
}
