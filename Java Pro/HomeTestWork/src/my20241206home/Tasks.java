package my20241206home;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        1. Чтение текста из файла и вывод на экран
//        Напишите программу, которая читает текстовый файл input.txt и выводит его содержимое на экран.
//        Используйте блок try-catch для обработки возможных ошибок, таких как отсутствие файла.
        Path path = Paths.get("resources", "input.txt");
        String text = "Напишите программу, которая читает текстовый файл input.txt и выводит его содержимое на экран.";
        createFileWithText(path, text);

        readFile(path);
//        Запись текста в файл
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
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }

    private static void createFileWithText(Path path, String text) {
        try (FileWriter writer = new FileWriter(String.valueOf(path));) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println("Error!" + e.getMessage());
        }
    }

    private static void readFile(Path path) {
        try (BufferedReader br = new BufferedReader(new FileReader(String.valueOf(path)));) {
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
