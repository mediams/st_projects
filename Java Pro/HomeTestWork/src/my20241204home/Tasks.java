package my20241204home;

import java.io.FileWriter;
import java.io.IOException;

public class Tasks {
    public static void main(String[] args) {
//        Напишите программу, которая создает текстовый файл output.txt и записывает в него строку "Привет, мир!".
//        Убедитесь, что файл создается в корневой папке вашего проекта.
//
//         Подсказка: Используйте классы FileWriter и блок try-catch.

        creatFile("output.txt","Привет, мир!" );
    }

    private static void creatFile(String file, String s) {
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
