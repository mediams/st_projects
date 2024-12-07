package my20241206home;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        1. Чтение текста из файла и вывод на экран
//        Напишите программу, которая читает текстовый файл input.txt и выводит его содержимое на экран.
//        Используйте блок try-catch для обработки возможных ошибок, таких как отсутствие файла.
        Path path = Paths.get("resources", "lines.txt");
        String text = "try (Scanner sc = new Scanner(System.in)) {\n" +
                "            System.out.print(\"Enter some text: \");\n" +
                "            String string = sc.nextLine();\n" +
                "            if (string.isEmpty()) {\n" +
                "                System.out.println(\"String is Empty!\");\n" +
                "                return;\n" +
                "            }";
        createFileWithText(path, text);

        readFile(path);
//        2. Запись текста в файл
//        Напишите программу, которая запрашивает у пользователя текст через консоль и записывает его в файл output.txt.
//        Если файл уже существует, он должен быть перезаписан. Добавьте обработку исключений для случаев, если что-то пойдёт не так.

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter some text: ");
            String string = sc.nextLine();
            if (string.isEmpty()) {
                System.out.println("String is Empty!");
                return;
            }
            createFileWithText(path, string);
        } catch (Exception e) {
            throw new RuntimeException();
//            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }

//        3. Копирование содержимого файла
//        Напишите программу, которая копирует содержимое файла source.txt в файл destination.txt.
//        Если файл source.txt отсутствует, программа должна вывести сообщение об ошибке.
//        Используйте блок try-with-resources для автоматического закрытия потоков.

        try (BufferedReader br = new BufferedReader(new FileReader(String.valueOf(path)));
             FileWriter writer = new FileWriter("destination.txt")
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                writer.write(line + "\n");
//                writer.write(System.lineSeparator()); //-----------------------
            }
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

//        4. Подсчёт строк в файле
//        Напишите программу, которая считает количество строк в текстовом файле lines.txt.
//        Если файл пуст или отсутствует, программа должна выводить соответствующее сообщение.


    }

    private static void createFileWithText(Path path, String text) {
        try (FileWriter writer = new FileWriter(path.toString(), StandardCharsets.UTF_8, true);) {
            writer.write(text + "\n");
        } catch (IOException e) {
            System.err.println("Error!" + e.getMessage());
        }
    }

    private static void readFile(Path path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path.toString()));) {//------------------
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found!" + e.getMessage());
        } catch (IOException e) {
            System.err.println("Read error!" + e.getMessage());
        }
    }
}
