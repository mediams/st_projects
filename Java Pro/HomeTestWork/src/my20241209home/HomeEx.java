package my20241209home;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class HomeEx {
    public static void main(String[] args) {
//        Простое чтение и запись текста в файл
//        Создайте программу, которая:
//
//        Читает строки из файла input.txt.
//        Записывает их в файл output.txt.

        Path path = Paths.get("resources", "shelty sheep dog.jpg");
//        readAndCopyToFile(path);

//        Копирование содержимого файла
//        Напишите программу, которая:
//        Копирует содержимое файла shelty sheep dog.jpg в файл shelty sheep dog_copy.jpg с использованием FileInputStream и FileOutputStream.

        try (
                FileInputStream fis = new FileInputStream(path.toString());
                FileOutputStream fos = new FileOutputStream("./resources/shelty sheep dog_copy.jpg")
        ) {
            int input;
            while ((input = fis.read())!=-1) {
                fos.write(input);
            }

            byte[] buffer = new byte[8192]; // 8 KB buffer  // ---------------------------
            int bytesRead                                   // ---------------------------
            while ((bytesRead = fis.read(buffer)) != -1) {  // ---------------------------
                fos.write(buffer, 0, bytesRead);        // ---------------------------
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void readAndCopyToFile(Path path) {
        if (!Files.exists(path)) { //------------
            try {
                Files.createDirectories(path); // ----------
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()));
                FileWriter writer = new FileWriter(".\\resources\\input_copy.txt")
        ) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.write(System.lineSeparator());
            }
            Path outputPath = Paths.get("resources", "input_copy2.txt");

            List<String> lines = Files.readAllLines(path);//--------------
            Files.write(outputPath, lines);// ------------------

        } catch (FileNotFoundException e) {
            System.err.println("File Not Found Exception: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
