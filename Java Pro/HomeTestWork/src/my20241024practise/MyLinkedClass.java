package my20241024practise;


@Getter
@Setter
public class MyLinkedClass {
    private int num;

    private MyLinkedClass next;

    public MyLinkedClass(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public MyLinkedClass getNext() {
        return next;
    }

    public void setNext(MyLinkedClass next) {
        this.next = next;
    }

    public boolean isCycled(MyLinkedClass head) {
        MyLinkedClass slow = head;
        MyLinkedClass fast = head.next;

        while ( slow != fast){
            if (slow == null || fast.next == null)
        }

        return true;
    }

    public static void main(String[] args) {
        MyLinkedClass l1 = new MyLinkedClass(1);
        MyLinkedClass l2 = new MyLinkedClass(0);
        MyLinkedClass l3 = new MyLinkedClass(4);
        MyLinkedClass l4 = new MyLinkedClass(8);
        MyLinkedClass l5 = new MyLinkedClass(12);

        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        l4.setNext(l5);
        l5.setNext(l3);


    }

}
