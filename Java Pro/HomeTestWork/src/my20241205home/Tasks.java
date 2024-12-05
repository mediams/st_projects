package my20241205home;

import java.io.FileWriter;
import java.io.IOException;

public class Tasks {
    public static void main(String[] args) {
//        Напишите программу, которая создает текстовый файл output.txt и записывает в него строку "Привет, мир!".
//        Убедитесь, что файл создается в корневой папке вашего проекта.

        try (FileWriter writer = new FileWriter(".\\resources\\output.txt")) {
            writer.write("Привет, мир!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
