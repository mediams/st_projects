package my20250216home;

import java.util.*;

public class TaskEx {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<String> townList = new LinkedList<>(List.of(
            "Adelaide", "Alice Springs", "Brisbane", "Darwin", "Melbourne", "Perth"
    ));

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            printMessage();
            ListIterator<String> iterator = townList.listIterator();
            while (iterator.hasNext()) {
//            String back = iterator.();

                switch (scanner.nextLine().toLowerCase()) {
                    case "m" -> {
                        break;
                    }
                    case "f" -> {
                        String forwad = iterator.next();
                        System.out.println(forwad);
                    }
                    case "b" -> {
                        if (iterator.hasPrevious()) {
                            System.out.println(iterator.previous());
                        }
                    }
                    case "q" -> flag = false;
                    default -> {
                        System.out.println("Error!");
                        flag = true;
                    }
                }
            }
        }
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
