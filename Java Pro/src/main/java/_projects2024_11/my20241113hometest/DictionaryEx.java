package _projects2024_11.my20241113hometest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {

    // не эффективно
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("english", "по-русски");

//        String word = "Test";
//        String word = "English";
//        String word = "по-русски";
        System.out.println("Введите слово для перевода: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        getTranslate(dictionary, word);

        System.out.println("Весь словарь: \n" + dictionary);
    }

    private static void getTranslate(Map<String, String> dictonary, String word) {
        String wordToSearch = word.toLowerCase().trim();
        for (Map.Entry<String, String> entry : dictonary.entrySet()) {
            if (entry.getKey().equals(wordToSearch) || entry.getValue().equals(wordToSearch)) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            } else {
                System.out.println("В словаре нет этого слова.");
                System.out.println("Хотите добавить новое слово в словарь?");
                Scanner scanner = new Scanner(System.in);
                boolean check = false;
                while (!check) {
                    System.out.println("Введите: y или n");
                    String input = scanner.nextLine();
                    if (input.equals("y")) {
                        System.out.println("Введите английский вариант:");
                        String english = scanner.nextLine();
                        System.out.println("Введите русский вариант:");
                        String russian = scanner.nextLine();
                        addWord(dictonary, english, russian);
                        check = true;
                    } else if (input.equals("n")) {
                        return;
                    }
                }
            }
        }
    }

    private static void addWord(Map<String, String> dictonary, String english, String russian) {
        dictonary.put(english, russian);
        System.out.println("Добавлено: " + english + " : " + russian);

    }
}
