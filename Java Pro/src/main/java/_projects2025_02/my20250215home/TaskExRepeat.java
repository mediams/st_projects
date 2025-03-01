package my20250215home;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TaskExRepeat {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            printMessage();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addToList(groceries);
                case 2 -> {
                    removeFromList(groceries);
                }
                default -> flag = false;
            }
        }
    }

    private static void removeFromList(ArrayList<String> groceries) {
        System.out.println("remove any items (comma delimited list): ");
        String[] strings = scanner.nextLine().split(",");
        for (String string : strings) {
            String trimmed = string.trim();
            if (groceries.contains(trimmed)) {
                groceries.remove(trimmed);
            }
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
    }

    private static void addToList(ArrayList<String> groceries) {
        System.out.println("add item(s) to list (comma delimited list): ");
        String[] strings = scanner.nextLine().split(",");
        for (String string : strings) {
            String trimmed = string.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
    }

    private static void printMessage() {
        System.out.print("""
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""");
        System.out.println(" ");
    }
}
