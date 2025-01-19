package my20250118homework;

import java.util.Arrays;

public class MyStack {
    private String[] data;
    private int currentCount;

    public MyStack(int capacity) { // time O(n), space O(n)
        data = new String[capacity];
        currentCount = 0;
    }

    public void push(String element) { // O(1)
        if (currentCount == data.length) throw new RuntimeException("Stack is full");
        data[currentCount++] = element;
    }

    public String pop() { // O(1)
        if (currentCount == 0) throw new RuntimeException("Stack is empty");
        String element = data[currentCount - 1];
        data[currentCount-- - 1] = null;
        return element;
    }

    public String peek() { // O(1)
        if (currentCount == 0) throw new RuntimeException("Stack is empty");
        return data[currentCount - 1];
    }

    public int size() {  // O(1)
        return currentCount;
    }

    public boolean isEmpty() {  // O(1)
        return currentCount == 0;
    }

    @Override
    public String toString() {  // O(n)
        return "MyStack{" +
                "data=" + Arrays.toString(data) +
                ", currentCount=" + currentCount +
                '}';
    }
}
