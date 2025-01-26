package org.example;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        PangramChecker p = new PangramChecker();
        System.out.println(p.check("The quick brown fox jumps over the lazy dog"));
    }

    public boolean check(String sentence) {
        String pangram = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (pangram.length() < 26) {
            return false;
        }
        Set<Character> set = new HashSet<Character>(26);
        for (char c : pangram.toCharArray()) {
            set.add(c);
        }
        if (set.size() != 26) return false;
        return true;
    }
}
