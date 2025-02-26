package my20250226home;

import org.bson.internal.BsonUtil;

public class SwitchEx {
    public static void main(String[] args) {
        char c = 'g';

        switch (c) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            default:
                System.out.println("Not found: " + c);
                break;
        }

        printDayOfWeek(0);

    }

    private static void printDayOfWeek(int day) {
        if (day > 6) {
            System.out.println("Invalid day");
            return;
        }

        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("22");
            case 3 -> System.out.println("33");
            case 4 -> System.out.println("44");
            case 5 -> System.out.println("55");
            default -> System.out.println("Invalid day");
        }

        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            default -> "Invalid";
        };
        System.out.println(dayOfWeek);
    }
}
