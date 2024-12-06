package my20241206home;

import java.io.FileWriter;
import java.io.IOException;

public class Tasks {
    public static void main(String[] args) {
//        1. Чтение текста из файла и вывод на экран
//        Напишите программу, которая читает текстовый файл input.txt и выводит его содержимое на экран.
//        Используйте блок try-catch для обработки возможных ошибок, таких как отсутствие файла.
        try (FileWriter writer = new FileWriter(".\\resources\\input.txt");){
            writer.write("Напишите программу, которая читает текстовый файл input.txt и выводит его содержимое на экран.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
