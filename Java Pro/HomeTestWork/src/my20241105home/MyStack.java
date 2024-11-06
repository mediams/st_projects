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
        data[count] = s;
        count++;
    }

    public String pop(){
        count--;
        String t = data[count];
        data[count] = null;
        return t;
    }

    public boolean isEmpty() {
        boolean check = false;
        if (this.data == null) {
            return true;
        }
        if (data.length == 0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push("Test");
        myStack.push("Test2");
//        myStack.push("Test3");
        System.out.println(myStack.isEmpty());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        myStack.push("Test3");
//        myStack.push("Test3");
//        myStack.push("Test3");
        System.out.println(myStack);

    }
//    pop()
//
//    peek()
//
//    size()
//
//    isEmpty()

}
