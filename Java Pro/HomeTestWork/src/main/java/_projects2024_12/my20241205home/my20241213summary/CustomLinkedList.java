package _projects2024_12.my20241205home.my20241213summary;

public class CustomLinkedList {

    private Node first;

    private static class Node {
        String data;
        Node next;

        Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void pushToHead(String element){ // O(1)
        Node node = new Node(element, first);
        first = node;
    }

    public void pushToTail(String element) { // O(n)
        if (first == null) {
            first = new Node(element, null);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(element, null);
        }
    }

    public void pushToIndex(String element, int index) { // O(n)
        if (index == 0) {
            pushToHead(element);
            return;
        }
        Node previous = first;
        for (int i = 1; i <= index - 1; i++) {
            if (previous == null) throw new RuntimeException("Index is out of bounds");
            previous = previous.next;
        }
        if (previous == null) throw new RuntimeException("Index is out of bounds");
        Node newNode = new Node(element, previous.next);
        previous.next = newNode;
    }

    public String get(int index){ // O(n)
        Node current = first;
        for (int i = 1; i <= index; i++) {
            if (current == null) throw new RuntimeException("Index is out of bounds");
            current = current.next;
        }
        if (current == null) throw new RuntimeException("Index is out of bounds");
        return current.data;
    }

    public void removeFirst() { // O(1)
        if (first == null) throw new RuntimeException("No elements in list");
        first = first.next;
    }

    public int size() { // O(n)
        int count = 0;
        Node current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void print() { // O(n)
        Node current = first;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}
