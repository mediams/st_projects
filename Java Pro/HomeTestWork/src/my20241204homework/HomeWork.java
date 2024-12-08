package my20241204homework;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HomeWork {
    public static void main(String[] args) {
//        1. Создайте файл с текстом: "This is my first experience when I work with IO API. I can do everything!"
//        Откройте и прочтите файл, напечатав его содержимое в консоль.
        try {
            try (FileWriter writer = new FileWriter("fileWithText.txt")) {
                writer.write("This is my first experience when I work with IO API.\nI can do everything!");
            }
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader("fileWithText.txt"))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        2. Один метод вызывает три других метода, которые выбрасывают проверяемые и непроверяемые исключения:
        try {
            oneMethod();
        } catch (MyAppException e) {
            System.out.println("Message:" + e.getMessage());
            System.out.println("Cause:" + e.getCause());
        }


//   3. В некотором методе возникает Exception. Реализовать логирование стектрейса Exception со временем ошибки в файл errors.log.
//    Логи всех возникших Exception должны накапливаться в файле, не перезаписываясь при перезапуске программы.
        try {
            someMethod();
        } catch (Exception e) {
            logError(e);
        }

    }

    private static void oneMethod() throws MyAppException {
        try {
            method1();
        } catch (ArithmeticException e) {
            throw new MyAppException("ArithmeticException: " + e.getMessage(), e);
        }

        try {
            method2();
        } catch (NullPointerException e) {
            throw new MyAppException("NullPointerException: " + e.getMessage(), e);
        }

        try {
            method3();
        } catch (IOException e) {
            throw new MyAppException("IOException" + e.getMessage());
        }
    }

    public static void method1() {
        System.out.println(1 / 0);
    }

    public static void method2() {
        throw new NullPointerException("nulls everywhere!");
    }

    public static void method3() throws IOException {
        throw new IOException("File not found");
    }


    public static void someMethod() {
        throw new ArithmeticException("Just ArithmeticException");
    }

    public static void logError(Exception e) {
        try (FileWriter fileWriter = new FileWriter(".\\resources\\errors.log", true);
             PrintWriter writer = new PrintWriter(fileWriter)) {
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            fileWriter.write(time);
            fileWriter.write("\n");
            e.printStackTrace(writer);
        } catch (IOException eIO) {
            throw new RuntimeException(eIO);
        }
    }

}
