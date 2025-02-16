package my20250216home;

import java.util.LinkedList;
import java.util.ListIterator;

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

        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);
        System.out.println("testIterator-------------");
        testIterator(placesToVisit);
        System.out.println("testIterator2-------------");
        testIterator2(placesToVisit);
        System.out.println("testIterator3-------------");
        testIterator3(placesToVisit);

        System.out.println("-------------");
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
        list.push("Hobart");
        System.out.println(list);

        String p4 = list.pollFirst(); // removes last element
        System.out.println(p4 + " was removed");

        System.out.println(list);
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(1));

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        System.out.println("Paris is at position: " + list.indexOf("Paris"));
        System.out.println("Sedney is at position: " + list.lastIndexOf("Sedney"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        // Stack retrieval methods
        System.out.println("Element from peek(): " + list.peek());
        System.out.println("Element from peekFirst(): " + list.peekFirst());
        System.out.println("Element from peekLast(): " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println("--> From: " + list.get(i) + " to " + list.get(i + 1));
        }
        System.out.println("Trip ends at: " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());
        String previousTown = list.getFirst();
        for (String string : list) {
            System.out.println("--> From: " + previousTown + " to " + string);
            previousTown = string;
        }
        System.out.println("Trip ends at: " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at: " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(list);
    }

    private static void testIterator2(LinkedList<String> list) {
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Darein")) {
                iterator.remove(); // wichtig! list.remove - error
            }
        }
        System.out.println(list);
    }

    private static void testIterator3(LinkedList<String> list) {
        System.out.println();
        System.out.println(list);
        System.out.println("listIterator hasNext()");
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            String i = iterator.next();
            System.out.println("* " + i);
            if (i.equals("Paris")) {
                iterator.add("Some Lake");
            }
        }
        System.out.println(list);
        System.out.println();
        System.out.println("hasPrevious()\n");
        while (iterator.hasPrevious()) {
            System.out.println("- " + iterator.previous());
        }
        System.out.println(list);
    }


}
