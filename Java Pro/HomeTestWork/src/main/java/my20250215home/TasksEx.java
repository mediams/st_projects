package my20250215home;

import java.util.*;

public class TasksEx {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("add item(s) to list (comma delimited list):");
        String[] items = scanner.nextLine().split(",");
        for (String item : items) {
            String trimmed = item.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("remove any item(s) to list (comma delimited list):");
        String[] items = scanner.nextLine().split(",");
        for (String item : items) {
            String trimmed = item.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printActions() {
        String textBlock = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }
}
