package my20241113hometest;

import java.util.HashMap;
import java.util.Map;

public class DectionaryEx {
    public static void main(String[] args) {
        Map<String, String> dictonary = new HashMap<>();

        dictonary.put("english", "по-русски");

//        String word = "Test";
        String word = "english";

        getTranslate(dictonary, word);
        
        String english = "New Word";
        String russian = "Новое слово";
        addWord(english, russian);
    }

    private static void getTranslate(Map<String, String> dictonary, String word) {

        for (Map.Entry<String, String> entry : dictonary.entrySet()){
            if (entry.getKey() == word) {
                System.out.println("Hit!");
            } else System.out.println("No!");
        }

    }

    private static void addWord(String english, String russian) {

    }
}
