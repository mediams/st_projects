package my20241205home;

import java.io.*;

public class Tasks {
    public static void main(String[] args) {
//        Напишите программу, которая создает текстовый файл output.txt и записывает в него строку "Привет, мир!".
//        Убедитесь, что файл создается в корневой папке вашего проекта.

        try (FileWriter writer = new FileWriter(".\\resources\\source.txt")) {
            writer.write("Напишите программу, которая считывает содержимое файла source.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//    Создайте текстовый файл input.txt, добавьте туда несколько строк текста (например, "Привет, Java!\nКак дела?").
//    Напишите программу, которая считывает содержимое файла и выводит его в консоль.
        try (FileReader reader = new FileReader("input.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Напишите программу, которая считывает содержимое файла source.txt и записывает его в новый файл destination.txt.
//        Если файл source.txt не существует, программа должна вывести сообщение об ошибке и завершить работу.

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\resources\\source.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter(".\\resources\\destination.txt"))
        ) {
            String line;
            while((line = bufferedReader.readLine())!= null){
                writer.write(line);
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
