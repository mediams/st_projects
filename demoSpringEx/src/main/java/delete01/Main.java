package delete01;

public class Main {
    public static void main(String[] args) {
        for (Weensday value : Weensday.values()) {
            System.out.println(value + ": " + (value.isWorkingDay() ? "not frei day" : "frei day"));

        }
        for (HttpStatus httpStatus : HttpStatus.values()) {
            System.out.println(httpStatus.getStatusCode() + ": " + httpStatus.getMessage());
        }

        System.out.println(Operation.ADD.apply(5, 4));
        System.out.println(Operation.SUBTRACT.apply(5, 4));
        System.out.println(Operation.MULTIPLY.apply(5, 4));
        System.out.println(Operation.DIVIDE.apply(5, 4));

        OrderStatus status = OrderStatus.NEW;
        System.out.println(status); // NEW
        status = status.nextStatus();
        System.out.println(status); // PROCESSING
        status = status.nextStatus();
        System.out.println(status);
        status = status.nextStatus();
        System.out.println(status);
        status = status.nextStatus();
        System.out.println(status);
        status = status.nextStatus();
        System.out.println(status);

    }
}
