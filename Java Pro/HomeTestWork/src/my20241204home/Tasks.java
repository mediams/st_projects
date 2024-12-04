package my20241204home;

import java.io.*;

public class Tasks {
    public static void main(String[] args) {
//        Напишите программу, которая создает текстовый файл output.txt и записывает в него строку "Привет, мир!".
//        Убедитесь, что файл создается в корневой папке вашего проекта.
//
//         Подсказка: Используйте классы FileWriter и блок try-catch.

        createFile("input.txt", "Привет, Java!\nКак дела?");

//        Создайте текстовый файл input.txt, добавьте туда несколько строк текста (например, "Привет, Java!\nКак дела?").
//        Напишите программу, которая считывает содержимое файла и выводит его в консоль.
//
//        Подсказка: Используйте FileReader и BufferedReader.

        readFile("input.txt");

//        Напишите программу, которая считывает содержимое файла source.txt и записывает его в новый файл destination.txt.
//        Если файл source.txt не существует, программа должна вывести сообщение об ошибке и завершить работу.
//
//        Подсказка: Используйте блок try-catch для обработки исключений и работу с файлами.

        copyTextToFile();

    }

    private static void copyTextToFile() {
        createFile("source.txt", "Привет, Java!\nКак дела?");
        File sourceFile = new File("source.txt");
        File destinationFile = new File("destination.txt");

        if (!sourceFile.exists()) {
            System.out.println("Not found: " + sourceFile);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Successful!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void readFile(String file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createFile(String file, String s) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(s);
            writer.close();
            System.out.println("Created");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
