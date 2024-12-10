package my20241114class;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HomeWorkTickets {
    public static void main(String[] args) {
        Map<String, String> ticketsMap = new HashMap<>();
        ticketsMap.put("Berlin", "London");
        ticketsMap.put("Tokyo", "Seoul");
        ticketsMap.put("Mumbai", "Berlin");
        ticketsMap.put("Seoul", "Mumbai");

        printTicketsInOrder(ticketsMap);
    }

    public static void printTicketsInOrder(Map<String, String> ticketsMap) {
        Set<String> destinations = new HashSet<>(ticketsMap.values());
        String startCity = null;
        System.out.println(destinations);

        for (String city : ticketsMap.keySet()) {
            if (!destinations.contains(city)) {
                startCity = city;
                break;
            }
        }
        System.out.println(ticketsMap);

        String currentCity = startCity;
        while (currentCity != null) {
            System.out.print(currentCity +" - "+ticketsMap.get(currentCity)+ ", ");
            currentCity = ticketsMap.get(currentCity);
        }
    }

//    public static void printTicketsInOrder(Map<String, String> ticketsMap) { // 0(n)
//        Map<String, String> reverseMap = new HashMap<>();
//        for (Map.Entry<String, String> entry : ticketsMap.entrySet()) { // 0(n)
//            reverseMap.put(entry.getValue(), entry.getKey());
//            String currentCity = reverseMap.entrySet().iterator().next().getKey();
//            String firstCity = currentCity;
//            while (firstCity != null) { // 0(n)
//                currentCity = firstCity;
//                firstCity = reverseMap.get(currentCity);
//                System.out.println("First city: " + currentCity);
//                while (currentCity != null) { // 0(n)
//                    String destinationCity = ticketsMap.get(currentCity);
//                    System.out.println(currentCity + "-----"+destinationCity);
//                    currentCity = destinationCity;
//                }
//            }
//        }
//    }
}



