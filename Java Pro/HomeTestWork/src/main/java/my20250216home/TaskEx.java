package my20250216home;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class TaskEx {
    public static void main(String[] args) {
        LinkedList<Place> placeToVisit = new LinkedList<>();

        addPlace(placeToVisit, new Place("Adelaide", 1374));
        addPlace(placeToVisit, new Place("adelaide", 1374));
        addPlace(placeToVisit, new Place("Alice", 917));
        addPlace(placeToVisit, new Place("Springs", 3923));
        addPlace(placeToVisit, new Place("Brisbane", 2771));
        addPlace(placeToVisit, new Place("Darwin", 3972));
        addPlace(placeToVisit, new Place("Melbourne", 877));
        addPlace(placeToVisit, new Place("Perth", 374));

        placeToVisit.addFirst(new Place("Sydney", 0));

        System.out.println(placeToVisit);

        var iterator = placeToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        printMessage();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }

            System.out.println("Enter value: ");
            String menuItem = scanner.nextLine().toLowerCase().substring(0, 1);

            switch (menuItem) {
                case "f" -> {
                    System.out.println("User want to go forward");
                    if (!forward) { // reverse direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next(); // Adjust position forward
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                case "b" -> {
                    System.out.println("User want to go backrwards");
                    if (forward) { // reverse direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous(); // Adjust position forward
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "m" -> {
                    printMessage();
                }
                case "l" -> {
                    System.out.println(placeToVisit);
                }
                default -> {
                    quitLoop = true;
                }
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Duplicate found!");
            return;
        }

        for (Place town : list) {
            if (town.name().equalsIgnoreCase(place.name())) {
                System.out.println("Duplicate found!");
                return;
            }

        }
        
        int matchIndex = 0;
        for (var distance : list) {
            if (place.distance() < distance.distance()) {
                list.add(matchIndex, place);
                return;
            }
            matchIndex++;
        }
        list.add(place);
    }

    private static void printMessage() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit:""");
        System.out.println();
    }
}
