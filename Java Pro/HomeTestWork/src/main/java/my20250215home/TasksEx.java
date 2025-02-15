package my20250215home;

import _projects2024_10.my20241024home_two.Task;

import java.util.ArrayList;
import java.util.Scanner;

record GroceryItems(int id, String name, String day) {
    private static int idCounter = 1;

    public GroceryItems(String name) {
        this(idCounter++, name, "MONDAY");
    }

}

public class TasksEx {
    private static ArrayList<GroceryItems> groceryItemsArrayList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Available actions: " +
                "\n0 - to shutdown " +
                "\n1 - to add item(s) to list (comma delimited list)" +
                "\n2 - to remove any items (comma delimited list)");


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose: 0 or 1 or 2: ");
            String choose = sc.next();
            switch (choose) {
                case "0":
                    return;
                case "1":
                    addItemToList();
                    break;
                case "2":
                    System.out.println("removeAnyItems();");
                    break;
                default:
                    System.out.println("Неверный ввод, попробуйте снова.");
                    break;
            }
        }
    }

    private static void addItemToList() {
        System.out.println("Write the list (comma delimited list): ");
        Scanner sc = new Scanner(System.in);
        String addStringToList = sc.nextLine();
        groceryItemsArrayList.add(new GroceryItems(addStringToList));
        System.out.println(groceryItemsArrayList);
    }


}
