package my20250224home;

public class MethodOverloadEx {
    //    1 inch = 2.54 cm.
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68) + "cm");
        System.out.println(convertToCentimeters(5, 1) + "cm");
    }

    private static double convertToCentimeters(int heightInch) {
        return heightInch * 2.54;
    }

    private static double convertToCentimeters(int heightFeet, int heightInches) {
        return convertToCentimeters((heightFeet * 12) + heightInches);
    }
}
