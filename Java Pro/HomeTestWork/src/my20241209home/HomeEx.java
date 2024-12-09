package my20241209home;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HomeEx {
    public static void main(String[] args) {
//        Простое чтение и запись текста в файл
//        Создайте программу, которая:
//
//        Читает строки из файла input.txt.
//        Записывает их в файл output.txt.

        Path path = Paths.get("resources", "input.txt");
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()));
                FileWriter writer = new FileWriter(".\\resources\\input_copy.txt")
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.write(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException");
            e.printStackTrace();
        }
    }
}
