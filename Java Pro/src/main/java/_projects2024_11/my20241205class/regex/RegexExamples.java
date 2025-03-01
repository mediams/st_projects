package _projects2024_11.my20241205class.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void main(String[] args) {
        String text = "worldsa";
        String regex = "world.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.matches());

        System.out.println(Pattern.matches("world\\.","world.")); // . in the end 
        System.out.println(Pattern.matches("world.","world!")); // any symbol in the end 
        System.out.println(Pattern.matches("[ws]orld","world")); // w or s 
        System.out.println(Pattern.matches("[ws]orld","sorld")); // w or s
        System.out.println(Pattern.matches("world[!?.]","world!")); // ! or ? or
        System.out.println(Pattern.matches("[a-zü]","ü")); // ! or ? or
    }
}
