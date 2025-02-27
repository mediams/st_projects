package my20250224home;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0)); //should return 78.53981633974483 or 78.53981

        System.out.println(area(-1));  //should return -1 since the parameter is negative

        System.out.println(area(5.0, 4.0)); //should return 20.0 (5 * 4 = 20)

        System.out.println(area(-1.0, 4.0));  //should return -1 since first the parameter is negative
    }

    /*area of a circle*/
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return (radius * radius) * Math.PI;
    }

    /*area of a rectangle.*/
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}
