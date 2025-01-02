package _projects2024_12.my20241205home.my20241217practise;

import java.util.List;

public class ThreadExNew {
    public static void main(String[] args) throws InterruptedException {
        Thread partOne = new Thread(new PartOneNew());
        Thread partTwo = new Thread(new PartTwoNew());

        partOne.start();
        partTwo.start();

        partOne.join();
        partTwo.join();

        System.out.println(PartOneNew.sum + PartTwoNew.sum);

    }
}

class PartOneNew implements Runnable {
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

class PartTwoNew implements Runnable {
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
