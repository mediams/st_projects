package _projects2024_12.my20241205home.my20241206home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TasksCheckPass {
    public static void main(String[] args) {
        String regex = "(?=.*[A-Z])" +
                "(?=.*[a-z])" +
                "(?=.*\\d)" +
                "(?=.*[~!#$/\\-_])" +
                ".{8,15}";

        String password = "Admin123456#.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Password correct.");
        } else {
            System.out.println("Password incorrect.");
        }
    }
}
