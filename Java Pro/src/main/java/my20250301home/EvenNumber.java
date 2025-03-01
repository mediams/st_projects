package my20250301home;

public class EvenNumber {
    public static void main(String[] args) {
        int i = 5;
        int count = 0;

        while (i <= 20 && count < 5) {
            if (isEvenNumber(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
