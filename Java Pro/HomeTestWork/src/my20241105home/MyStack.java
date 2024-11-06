package my20241105home;

import java.util.Arrays;

public class MyStack {
    private String[] data;
    private int size;
    private int count;

    public MyStack(String[] data, int size) {
        this.data = data;
        this.size = size;
    }

    public MyStack(int size) {
        data = new String[size];
        this.size = size;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", count=" + count +
                '}';
    }

    public void push(String s) {
        if (isFull()) {
            return;
        }
        data[count] = s;
        count++;
    }

    public int size() {
        return count;
    }

    public String pop() {
        count--;
        if (isEmpty()) {
            System.out.println("Array is Empty!");
            return null;
        }
        String s = data[count];
        data[count] = null;
        return s;
    }

    public String peek() {
//        return data[count - 1];
        return null;
    }

    public boolean isEmpty() {
        if (data[0] == null) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (data[size - 1] != null) {
            System.out.println("Array is full!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push("Test");
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        myStack.push("Test2");
//        myStack.push("Test3");
        System.out.println(myStack.isEmpty());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        myStack.push("Test3");
        myStack.push("Test4");
        myStack.push("Test4");
        myStack.push("Test4");
//        myStack.push("Test5");
        myStack.push("Test6");
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
//        myStack.push("Test3");
//        myStack.push("Test3");
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());

    }


}
