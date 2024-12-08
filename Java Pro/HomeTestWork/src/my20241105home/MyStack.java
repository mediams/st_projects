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
            throw new RuntimeException("Stack is full");
        }
        data[count] = s;
        count++;
    }

    public int size() {
        return count;
    }

    public String pop() {
        if (isEmpty()) {
//            System.out.println("Array is Empty!");
//            return null;
            throw new RuntimeException("Stack is full");
        }
        count--;
        String s = data[count];
        data[count] = null;
        return s;
    }

    public String peek() {
        if (isEmpty()) {
//            System.out.println("Array is Empty!");
//            return null;
            throw new RuntimeException("Stack is Empty!");
        }
        return data[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push("Test");
        System.out.println(myStack);
        System.out.println("Function pop (): " + myStack.pop());
        System.out.println("Is Array Empty: " + myStack.isEmpty());
        System.out.println(myStack);
        myStack.push("Test2");
        System.out.println("Is Array Empty: " + myStack.isEmpty());
        System.out.println(myStack);
        System.out.println("Function pop (): " + myStack.pop());
        System.out.println(myStack);
        myStack.push("Test1");
        myStack.push("Test2");
        myStack.push("Test3");
        myStack.push("Test4");
        myStack.push("Test5");
//        myStack.push("Test6");
        System.out.println("Mehr als size" + myStack);
        System.out.println("Function pop (): " + myStack.pop());
        System.out.println("Function pop (): " + myStack.pop());
        System.out.println("Function pop (): " + myStack.pop());
        System.out.println("Function pop (): " + myStack.pop());
        System.out.println("Function pop (): " + myStack.pop());
//        System.out.println("Function pop (): " + myStack.pop());
//        myStack.push("Test3");
//        myStack.push("Test3");
        System.out.println(myStack);
//        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        System.out.println("Is Array Empty: " + myStack.isEmpty());

    }


}
