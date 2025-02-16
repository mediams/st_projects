package my20250216home;

import java.util.LinkedList;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class TaskEx {
    public static void main(String[] args) {
        LinkedList<Place> placeToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        Place adelaide2 = new Place("adelaide", 1374);
        addPlace(placeToVisit, adelaide);
        addPlace(placeToVisit, adelaide2);
        System.out.println(placeToVisit);

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
//        else System.out.println("added : " + place);
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
