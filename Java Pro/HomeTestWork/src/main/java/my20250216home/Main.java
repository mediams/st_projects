package my20250216home;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sedney");
        placesToVisit.add(0, "Paris");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);

        removeElements(placesToVisit);

        gettingElements(placesToVisit);
        System.out.println(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darein");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melborn");
        list.offerFirst("Brisbane");
        // Stack Methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Hobart");

        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");
        System.out.println(list);

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");
        System.out.println(list);

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
        System.out.println(list);

        //Queue/Deque poll methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");
        System.out.println(list);


        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");
        System.out.println(list);


        String p3 = list.pollFirst(); // removes last element
        System.out.println(p3 + " was removed");
        System.out.println(list);

        list.push("Sedney");
        list.push("Paris");
        list.push("Darein");
        System.out.println(list);

        String p4 = list.pollFirst(); // removes last element
        System.out.println(p4 + " was removed");
        System.out.println(list);
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(1));

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
    }
}
