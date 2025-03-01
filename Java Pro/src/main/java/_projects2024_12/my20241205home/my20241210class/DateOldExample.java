package _projects2024_12.my20241205home.my20241210class;

import java.util.Date;

public class DateOldExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        Date someDate = new Date(100);
        System.out.println(someDate);
        System.out.println(someDate.getTime());
    }
}
