package my20250302home;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(getSumDigit(226));
    }

    private static int getSumDigit(int i) {
        if (i < 9) {
            return i;
        }
        return i % 10 + getSumDigit(i / 10);
    }
}
