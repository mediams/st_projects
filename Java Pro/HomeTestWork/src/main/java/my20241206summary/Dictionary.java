package my20241206summary;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary {
    public static void main(String[] args) {
        String text = "Hello Wolrld!!! One, Two, Three";
        String[] s = text.split("o");
        System.out.println(Arrays.toString(s));

        s = text.split("\\W+");
        System.out.println(Arrays.toString(s));

        System.out.println(text.matches("[a-zA-Z!, ]+"));

        String result = text.replaceAll("o", "1");
        System.out.println(result);

        String novel = "The extension has been completely overhauled to allow it to take advantage of the latest web technologies, as well as to ensure continued compatibility with modern web browsers.";
//        String regex = "a";
        String regex = "\\b[a-zA-Z]{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(novel);

//        while (matcher.find()) {
//            System.out.println("Found: " + matcher.group() + ", start: " + matcher.start() + ", end: " + matcher.end());
//        }

        matcher.results()
                .forEach(r-> System.out.println("Found: " + r.group() + ", start: " + r.start() + ", end: " + r.end()));

        pattern = Pattern.compile("\\b[a-zA-Z]{2}\\b");
        matcher = pattern.matcher(novel);
        result = matcher.replaceAll("not a");
        System.out.println(result);

        String html = "<h1>Title1</h1><div>Text</div><h1>Title2</h1><h1>Title3</h1>";
        regex = "(<h1>)[a-zA-Z0-9]+(</h1>)";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(html);

        matcher.results()
                .forEach(r -> {
                    System.out.println("Found: " + r.group() + ", start: " + r.start() + ", end: " + r.end());
//                    System.out.println("Group1: " + r.group(1) + ", start: " + r.start(1) + ", end: " + r.end(1));
                    System.out.println("Group2: " + r.group(2) + ", start: " + r.start(2) + ", end: " + r.end(2));
//                    System.out.println("Group3: " + r.group(3) + ", start: " + r.start(3) + ", end: " + r.end(3));
                });


    }
}
