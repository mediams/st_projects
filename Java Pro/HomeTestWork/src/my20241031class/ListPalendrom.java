package my20241031class;

import java.util.*;

public class ListPalendrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mauiam"));
    }

    public static boolean isPalindrome(String word) {
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            charList.add(word.charAt(i));
        }
        System.out.println(charList);

        //O(n)
        Iterator<Character> iterator = charList.iterator();
        ListIterator<Character> listIterator = charList.listIterator(charList.size());
        int count = 0;
        while (iterator.hasNext() && listIterator.hasPrevious()) {
            if (count >= charList.size() / 2) break;

            Character currentLeft = iterator.next();
            Character currentRight = listIterator.previous();

            if (!currentLeft.equals(currentRight)) return false;
            count++;
        }
        return true;
    }
}
