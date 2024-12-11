package _projects2024_11.my20241125algorytmus;

public class RecEx {
    public static void main(String[] args) {
        int count = 5;
//        System.out.println("Open box with box count = " + count);
        openBox(count);
    }

    private static void openBox(int count) {
        // base case
        if (count == 0) {
            System.out.println("Base case. Case = " + (count + 1));
            return;
        }
        //recurrent case
        count--;
        System.out.println("Open box with box count = " + (count + 1));
        openBox(count);

        System.out.println("Close box with box count = " + (count + 1));
    }
}
