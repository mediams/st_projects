package my20250301home;

public class SumThreeAndFunf {
    public static void main(String[] args) {
        getSum();
    }

    public static void getSum() {
        int count = 0;
        int sum = 0;

        for (int i = 1; count < 5 && i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("sum " + sum);
    }
}
