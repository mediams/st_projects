package _projects2024_11.my20241103home;

public class AlgorithmsExample {
    public static void main(String[] args) {
        recursion(5);
    }

    public static void recursion(int n) {
        System.out.println("Start function n = " + n);
        // Base case
        if (n == 1) {
            System.out.println("Base case is exists n = " + n);
            return;
        }
        //Recurrent case
        System.out.println("Start recurrent case with n = " + n);
        int newN = n -1;
        recursion(newN);
        System.out.println("End function with n = " + n);
    }
}
