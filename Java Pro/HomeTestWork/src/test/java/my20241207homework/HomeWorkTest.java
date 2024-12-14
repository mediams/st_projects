package my20241207homework;

import org.junit.jupiter.api.Test;

import static my20241207homework.HomeWork.checkLoginAndPassword;
import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {
    HomeWork homeWork = new HomeWork();

    @Test
    void checkLoginValidTest() {
        //        Login должен содержать только латинские буквы, длина login должна быть от 3 до 20 символов.
        //        Password должен содержать только цифры и латинские буквы. Длина password должна быть от 5 до 20 символов.
        //        Также password и confirmPassword должны быть равны.
        String login = "john";
        String password = "1234a";
        String confirmPassword = "1234a";
        assertDoesNotThrow(() -> checkLoginAndPassword(login, password, confirmPassword));
    }

    @Test
    void checkLoginTooShortTest() {
        String login = "jo";
        String password = "1234a";
        String confirmPassword = "1234a";
        assertThrows(WrongLoginException.class, () -> checkLoginAndPassword(login, password, confirmPassword), "login должна быть от 3 символов");

    }

    @Test
    void checkLoginTooLongTest() {
        String login = "123456789012345678901";
        String password = "1234a";
        String confirmPassword = "1234a";
        assertThrows(WrongLoginException.class, () -> checkLoginAndPassword(login, password, confirmPassword), "login должна быть до 20 символов.");
    }

    @Test
    void checkLoginNullTest() {
        String login = null;
        String password = "1234a";
        String confirmPassword = "1234a";
        assertThrows(WrongLoginException.class, () -> checkLoginAndPassword(login, password, confirmPassword), "login должна быть not NULL");
    }
    @Test
    void checkLoginSymbolsTest() {
        String login = "üäяф";
        String password = "1234a";
        String confirmPassword = "1234a";
        assertThrows(WrongLoginException.class, () -> checkLoginAndPassword(, password, confirmPassword), "Login должен содержать только латинские буквы");
    }

}