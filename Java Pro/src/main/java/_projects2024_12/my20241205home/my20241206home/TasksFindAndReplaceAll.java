package _projects2024_12.my20241205home.my20241206home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TasksFindAndReplaceAll {
    public static void main(String[] args) {
        String text = "У пользователя есть 3 сообщения и 25 уведомлений.";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher= pattern.matcher(text);

        matcher.results()
                .forEach(matchResult -> System.out.println("Ich habe gefunden number: "+ matchResult.group()));

        System.out.println(matcher.replaceAll("NUMBER"));

    }
}
