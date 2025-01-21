package _projects2025_01.my20250109home;

public class CounterExample {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
