package my20250112algorithms;

import java.util.Arrays;

public class TasksEx {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("holo", "oloh"));
        System.out.println(areAnagrams("hello", "world"));
    }
}

