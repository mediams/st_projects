package my20241107home;

import java.util.HashMap;
import java.util.Map;

public class Tasks {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("John", 25);
        people.put("Ivan", 15);
        people.put("Mark", 21);

        System.out.println(people);
        int countAlter = 0;
        int countYounger = 0;
        for (Map.Entry<String, Integer> entry : people.entrySet()) {

            if (entry.getValue() > 15) {
                countAlter++;
                System.out.println(entry.getKey() + ", " + entry.getValue());

            } else {
                countYounger++;
                System.out.println(entry.getKey() + ", " + entry.getValue());
            }
        }
        System.out.println("countYounger = " + countYounger);
        System.out.println("countAlter = " + countAlter);
    }
}
