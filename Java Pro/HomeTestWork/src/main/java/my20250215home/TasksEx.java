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
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("add item(s) to list (comma delimited list):");
        String[] items = scanner.nextLine().split(",");
        groceries.addAll(List.of(items));
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
