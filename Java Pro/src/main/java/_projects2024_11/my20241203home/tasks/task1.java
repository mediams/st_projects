package _projects2024_11.my20241203home.tasks;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class task1 {
    public static void main(String[] args) {
//        Напишите программу, которая создает текстовый файл output.txt и записывает в него строку "Привет, мир!".
//        Убедитесь, что файл создается в корневой папке вашего проекта.
//
//        Подсказка: Используйте классы FileWriter и блок try-catch.

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




    }

    private static void readFile(String file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
            throw new RuntimeException(e);
        }
    }


    private static void createFile(String str, String text) {
        try {
            FileWriter writer = new FileWriter(str);
            writer.write(text);
            writer.close();
            System.out.println("File created.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
