package my20241214homework;

import my20241207homework.WrongLoginException;
import my20241207homework.WrongPasswordException;
import org.junit.jupiter.api.Test;

import static my20241207homework.HomeWork.checkLoginAndPassword;
import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {
    private final String password = "1234a";
    private final String confirmPassword = "1234a";
    private final String login = "john";

    @Test
    void checkLoginValidTest() {
        //        Login должен содержать только латинские буквы, длина login должна быть от 3 до 20 символов.
        //        Password должен содержать только цифры и латинские буквы. Длина password должна быть от 5 до 20 символов.
        //        Также password и confirmPassword должны быть равны.
        assertDoesNotThrow(() -> checkLoginAndPassword(login, password, confirmPassword));

    }

    @Test
    void checkLoginTooShortTest() {
        String login = "jo";
        assertThrows(WrongLoginException.class, () -> checkLoginAndPassword(login, password, confirmPassword), "login должна быть от 3 символов");
    }

    @Test
    void checkLoginTooLongTest() {
        String login = "123456789012345678901";
        assertThrows(WrongLoginException.class, () -> checkLoginAndPassword(login, password, confirmPassword), "login должна быть до 20 символов.");
    }

    @Test
    void checkLoginNullTest() {
        String login = null;
        assertThrows(WrongLoginException.class, () -> checkLoginAndPassword(login, password, confirmPassword), "login должна быть not NULL");
    }

    @Test
    void checkLoginSymbolsTest() {
        String login = "üäяф";
        assertThrows(WrongLoginException.class, () -> checkLoginAndPassword(login, password, confirmPassword), "Login должен содержать только латинские буквы");
    }

    @Test
    void checkPasswordSymbolsTest() {
        String password = "12345@";
        assertThrows(WrongPasswordException.class, () -> checkLoginAndPassword(login, password, password), "Password должен содержать только цифры и латинские буквы.");
    }

    @Test
    void checkPasswordOnlyLatinTest() {
        String password = "12345Ü";
        assertThrows(WrongPasswordException.class, () -> checkLoginAndPassword(login, password, password), "Password должен содержать только цифры и латинские буквы.");
    }

    @Test
    void checkPasswordTooShortTest() {
        String password = "1234";
        assertThrows(WrongPasswordException.class, () -> checkLoginAndPassword(login, password, password), "Password должен содержать только цифры и латинские буквы.");
    }

    @Test
    void checkPasswordTooLongTest() {
        String password = "123456789012345678901";
        assertThrows(WrongPasswordException.class, () -> checkLoginAndPassword(login, password, password), "Password должен содержать только цифры и латинские буквы.");
    }
    @Test
    void checkPasswordNotNull() {
        String password = null;
        assertThrows(WrongPasswordException.class, () -> checkLoginAndPassword(login, null, null), "Password должен содержать только цифры и латинские буквы.");
    }

    @Test
    void checkPasswordAndConfirmPasswordEqual() {
        assertEquals(password, confirmPassword);
    }

    @Test
    void checkPasswordAndConfirmPasswordNotEqual() {
        assertThrows(WrongPasswordException.class, () -> checkLoginAndPassword(login, "123456", "12346"));
    }
}