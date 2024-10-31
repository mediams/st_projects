package my20241031class;

public class Test {
    public static boolean isPalindrome(String word) {
        int rightIndex = word.length() - 1;
        for (int i = 0; i <= rightIndex; i++) {
            if (word.charAt(i) != word.charAt(rightIndex)) {
                return false;
            }
            rightIndex--;
        }
        return true;
    }

}
