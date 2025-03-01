package _projects2024_11.my20241113hometest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx_Correct {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("english", "по-русски");

        //        String word = "Test";
        //        String word = "English";
        //        String word = "по-русски";

        System.out.println("Введите слово для перевода: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase().trim();

        getTranslate(dictionary, word, scanner);

        System.out.println("Весь словарь: \n" + dictionary);
    }

    private static void getTranslate(Map<String, String> dictionary, String word, Scanner scanner) {
        if (dictionary.containsKey(word)) {
            System.out.println(word + " : " + dictionary.get(word));
        } else if (dictionary.containsValue(word)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                    return;
                }
            }
        } else {
            System.out.println("В словаре нет этого слова.");
            System.out.println("Хотите добавить новое слово в словарь? (y/n)");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                addWord(dictionary, scanner);
            }
        }
    }

    private static void addWord(Map<String, String> dictionary, Scanner scanner) {
        System.out.println("Введите английский вариант:");
        String english = scanner.nextLine().toLowerCase().trim();
        System.out.println("Введите русский вариант:");
        String russian = scanner.nextLine().toLowerCase().trim();
        dictionary.put(english, russian);
        System.out.println("Добавлено: " + english + " : " + russian);
    }
}