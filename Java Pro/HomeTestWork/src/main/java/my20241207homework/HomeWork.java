package my20241207homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork {
    public static void main(String[] args) {
//        1) Напишите регулярное выражение, которое соответствует любому номеру телефона согласно формату:
//        телефонный номер состоит из 7 цифр подряд или из 3х цифр, пробела или тире,
//        а затем из 4 цифр (1234567, 123-4567, 123 4567).

        String text = "1234567, 123-4567, 123 4567";
        String regex = "\\d{7}|\\d{3}[- ]\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        matcher.results()
                .forEach(matchResult -> System.out.println(matchResult.group()));

//        2) Напишите метод валидации введенного пользователем адреcа электронной почты.
        String emails = "test@mail.com, error_404@ya.ru, m.com, /brot/@.com";
        checkEmail(emails);

//        3) Напишите метод проверки логина и пароля.
        String login = "john";
        String password = "1234a1";
        String confirmPassword = "1234a";


        try {
            checkLoginAndPassword(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.err.println("WrongLoginException: " + e.getMessage());
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            System.err.println("WrongLoginException: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
//        Login должен содержать только латинские буквы, длина login должна быть от 3 до 20 символов.
        if (login == null || !login.matches("[a-zA-Z]{3,20}")) {
            throw new WrongLoginException("Login должен содержать только латинские буквы, длина login должна быть от 3 до 20 символов.");
        }

//            Password должен содержать только цифры и латинские буквы. Длина password должна быть от 5 до 20 символов.
        if (password == null || !password.matches("[a-zA-Z0-9]{5,20}")) {
            throw new WrongPasswordException("Password должен содержать только цифры и латинские буквы. Длина password должна быть от 5 до 20 символов.");
        }

//            Также password и confirmPassword должны быть равны.
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password и confirmPassword должны быть равны.");
        }

        return true;
    }

    private static void checkEmail(String emails) {
        String regex;
        Pattern pattern;
        regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        pattern = Pattern.compile(regex);
        Matcher matcherEmail = pattern.matcher(emails);

        matcherEmail.results()
                .forEach(matchResult -> System.out.println(matchResult.group()));
    }
}
