package my20241205home;

import java.io.*;

public class Tasks {
    public static void main(String[] args) {
//        Напишите программу, которая создает текстовый файл output.txt и записывает в него строку "Привет, мир!".
//        Убедитесь, что файл создается в корневой папке вашего проекта.

        try (FileWriter writer = new FileWriter(".\\resources\\numbers.txt")) {
            writer.write("1\n10\n3\n4\n5");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//    Создайте текстовый файл input.txt, добавьте туда несколько строк текста (например, "Привет, Java!\nКак дела?").
//    Напишите программу, которая считывает содержимое файла и выводит его в консоль.
        try (FileReader reader = new FileReader("input.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Напишите программу, которая считывает содержимое файла source.txt и записывает его в новый файл destination.txt.
//        Если файл source.txt не существует, программа должна вывести сообщение об ошибке и завершить работу.

        File file = new File(".\\resources\\data.txt");
        if (!file.exists()) {
            System.out.printf("Not found %s", file);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\resources\\source.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter(".\\resources\\destination.txt"))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Напишите программу, которая считывает текстовый файл data.txt и подсчитывает количество строк в нем.
//        Если файл пустой или отсутствует, программа должна вывести соответствующее сообщение.
        File file2 = new File(".\\resources\\data.txt");
        if (!file2.exists()) {
            System.out.printf("\nFile %s not found", file2);
            return;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\resources\\data.txt"))) {
            String line;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                count++;
            }
            if (count == 0) {
                System.out.println("File is empty.");
            } else System.out.println("\nколичество строк: " + count);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Создайте текстовый файл numbers.txt, в котором на каждой строке будет одно число (например, 1\n2\n3\n4\n5).
//        Напишите программу, которая:
//
//        Считает сумму всех чисел в файле.
//        Если в файле встречается нечисловое значение, программа должна вывести сообщение об ошибке, указав строку,
//        где произошла ошибка, но продолжить обработку оставшихся строк.

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\resources\\numbers.txt"));) {
            String l;
            int sum = 0;
            int count = 0;
            while ((l = bufferedReader.readLine()) != null) {
                count++;
                try {
                    sum += Integer.parseInt(l);
                } catch (NumberFormatException e) {
                    System.out.println("Error in line : " + count);
                    return;
                }
            }
            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
