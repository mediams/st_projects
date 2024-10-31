package my20241031class;

import java.util.*;

public class ListPalendrom {
    public static void main(String[] args) {
        isPalindrome("test");
    }

    public static boolean isPalindrome(String word) {
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            charList.add(word.charAt(i));
        }
        System.out.println(charList);

        Iterator<Character> iterator = charList.iterator();
        ListIterator<Character> listIterator = charList.listIterator(charList.size());
        while(iterator.hasNext() && listIterator.hasPrevious()){
            Character currentLeft = iterator.next();
            Character currentRight = listIterator.previous();
            if (currentLeft <= currentRight) {
                System.out.println("Ups");
                break;
            }
            if (currentLeft.equals(currentRight)) {
                System.out.println("hit");
            }else System.out.println("no");
        }

        return true;
    }
}
