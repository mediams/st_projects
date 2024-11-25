package my20241125algorytmus;

public class RecEx {
    public static void main(String[] args) {
        int count = 5;
        openBox(count);
    }

    private static void openBox(int count) {
        // base case
        if (count == 0) {
            System.out.println("Base case. Case = " + count);
            return;
        }
//recurrent case
        count--;
        System.out.println("Call recurrent case with count = " + count);
        openBox(count);
    }
}
