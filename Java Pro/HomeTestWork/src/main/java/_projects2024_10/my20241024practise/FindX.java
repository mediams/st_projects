package _projects2024_10.my20241024practise;

public class FindX {
    public static void main(String[] args) {
        int num = 1024;
        int num2 = 2;
        int k = 0;

        while (num != num2) {
            num /= 2;
            num2 *= 2;
        }
//        System.out.println((num / 2) * 8);
        System.out.println(num);
    }
}
