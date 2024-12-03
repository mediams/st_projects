package my20241203class;

public class Tasks {
    public static void main(String[] args) {
//        1. Напишите метод, который принимает целое число
//        в качестве параметра и выдает проверяемое исключение, если число нечетное.
        try {
            printEvenNumber(51);
        } catch (OddNumbersException e) {
            throw new RuntimeException(e.getMessage());
        }

//        2. Написать метод проверки введенного пароля. Если пароль неверен, выбрасывается проверяемое исключение
//        WrongPasswordException с сообщением "Password is wrong".

    }

    private static void printEvenNumber(int i) throws OddNumbersException {
        if (i % 2 != 0) {
            throw new ArithmeticException("Not Even");
        }
        System.out.println(i);
    }
}
