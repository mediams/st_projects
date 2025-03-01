package _projects2024_12.my20241205home.my20241206home;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
//        3) Напишите метод поиска в тексте всех слов, начинающихся с определенной буквы.
        Path path = Paths.get("resources", "filtered.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()))) {
            String line;
            String[] arraysWords;
            while ((line = bufferedReader.readLine()) != null) {
                arraysWords = line.split("\\W+");
                for (String s : arraysWords) {
                    if (s.startsWith("о")) {
                        System.out.println(s);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//                4) Имеется текст с логинами и паролями.
//                Найти в тексте выражения вида "login: admin, password: sKb122",
//                Найти в тексте выражения вида "login: user, password: 1234",
//                составить из них Map<login, password>
        String text = "//                4) Имеется текст с логинами и паролями.\n" +
                "//                Найти в тексте выражения вида \"login: admin, password: sKb122\",\n" +
                "//                Найти в тексте выражения вида \"login: user, password: 1234\",\n" +
                "//                составить из них Map<login, password>\n" +
                "login: 123\n" +
                "login: admin\n" +
                "login: admin2, password: sKb122";

        Pattern pattern = Pattern.compile("login: (\\w+), password: (\\w+)");
        Matcher matcher1 = pattern.matcher(text);
//        System.out.println(matcher1.group(1));

        Map<String, String> mapLoginPass = new HashMap<>();

        while (matcher1.find()) {
            mapLoginPass.put(matcher1.group(1), matcher1.group(2));
//            System.out.print("Login: " + matcher1.group(1));
//            System.out.println(", Pass: " + matcher1.group(2));
        }

        matcher1.results()
                .forEach(matchResult -> System.out.println(matchResult.group()));


//        Map<String, String> mapLoginPass = text.lines()
//                .collect(Collectors.toMap(s -> matcher1.group(1), s -> matcher1.group(2)));
        for (Map.Entry<String, String> entry : mapLoginPass.entrySet()) {
            System.out.println("LOGIN : " + entry.getKey() + ", PASS: " + entry.getValue());
        }


        String[] arraysString = text.split("\n");
        for (String s : arraysString) {
            Matcher matcher = pattern.matcher(s);
//            if (matcher.matches()) {
            if (matcher.find()) {
                System.out.println(s);
            }
        }


//        Для закрепления:
//        Попробуй составить регулярное выражение для проверки URL.
//        Напиши код, который заменяет все пробелы в строке на символ _.
//        Найди в тексте все слова, начинающиеся с большой буквы.

    }
}
