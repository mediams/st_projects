package my20241105class;

import java.util.LinkedList;

public class CustomStack {


    private LinkedList<String> list = new LinkedList<>();

    public void push(String data) {
        list.addLast(data);
    }

    public String pop() {
        return list.removeLast();
    }

    public String peek() {
        return list.getLast();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        
    }
}
