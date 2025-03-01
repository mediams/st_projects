package _projects2024_12.my20241205home.my20241219home;

public class Main {
    public static void main(String[] args) {
        Thread taskOne = new Thread(new MyThreadOne());
        taskOne.start();

        Thread taskTwo = new Thread(new MyThreadTwo());
        taskTwo.start();

//        List<Integer> integerList = new ArrayList<>(taskOne.start());
    }
}
