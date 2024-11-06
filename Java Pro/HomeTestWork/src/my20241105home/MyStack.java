package my20241105home;

public class MyStack {
    private String[] data;
    private int size;
    private int count;

    public MyStack(String[] data, int size) {
        this.data = data;
        this.size = size;
    }

    public MyStack(int size) {
        this.size = size;
    }

    public void push(String s){

    }

    public boolean isEmpty() {
        boolean check = false;
        if (this.data == null) {
            return true;
        }
        if (data.length == 0 || this.data == null) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        System.out.println(myStack.isEmpty());

    }

//    push()
//
//    pop()
//
//    peek()
//
//    size()
//
//    isEmpty()

}
