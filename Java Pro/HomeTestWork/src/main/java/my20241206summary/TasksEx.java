package my20241206summary;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TasksEx {
    public static void main(String[] args) {
//        1) Имеется текст "Php is the best programming language in the world. I study php." Замените в нем php на java.
        String text = "Php is the best programming language in the world. I study php.";
        String newText = text.replaceAll("[Pp]hp", "Java");
        System.out.println(newText);
        System.out.println();
//        2) Разбить текст на список отдельных строк этого текста.
        String text2 = "Php is the best\nprogramming language in the world.\nI study php.";
        String[] split = text2.split("\n");
//        System.out.println(Arrays.toString(split));
        for (String s : split){
            System.out.println(s);
        }

//        3) Напишите метод поиска в тексте всех слов, начинающихся с определенной буквы.

        List<String> list= findWorlds(text, 'p');
        System.out.println(list);

//                4) Имеется текст с логинами и паролями. Найти в тексте выражения вида "login: admin, password: sKb122",
//                составить из них Map<login, password>

        String someText = "Имеется текст с логинами и \"login: user, password: 1234\" паролями. Найти в тексте выражения вида \"login: admin, password: sKb122\", составить из них Map";
        Map<String, String> mapList = findPasswortAndLogin(someText);
        System.out.println(mapList);

    }

    private static Map<String, String> findPasswortAndLogin(String text) {
        Map<String, String> mapList = new HashMap<>();
        Pattern pattern = Pattern.compile("login: (\\w+), password: (\\w+)");
        Matcher matcher = pattern.matcher(text);

        matcher.results()
                .forEach(r -> System.out.println("Found: " + r.group()));

        mapList = matcher.results()
                .collect(Collectors.toMap(r->r.group(1),
                        r-> matcher.group(2)));

        return mapList;
    }


    public static List<String> findWorlds(String text, char letter){
        List <String> words = new ArrayList<>();
        for (String word : text.split("\\s+")) {
            if (word.toLowerCase().startsWith(String.valueOf(letter))) {
                words.add(word);
            }
        }
        return words;
    }
}
