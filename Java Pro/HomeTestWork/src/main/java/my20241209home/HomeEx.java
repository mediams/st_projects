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

        Path path = Paths.get("resources", "input.txt");
        readAndCopyToFile(path);

//        Копирование содержимого файла
//        Напишите программу, которая:
//        Копирует содержимое файла shelty sheep dog.jpg в файл shelty sheep dog_copy.jpg с использованием FileInputStream и FileOutputStream.

//        copyFile(path);

//        Чтение и запись объектов
//        Создайте класс Person с полями name и age. Реализуйте программу, которая:
//
//        Записывает объект Person в файл person.dat с использованием ObjectOutputStream.
//        Считывает объект из файла с использованием ObjectInputStream.

//        copyObject();

//        Реализуйте программу, которая:
//        Считает количество символов, слов и строк в файле text.txt с использованием потоков.

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()))) {
//            System.out.println(bufferedReader.lines()
//                    .count());
            String line;
            int coundWords = 0;
            int countLine =0;
            while ((line = bufferedReader.readLine()) != null) {
                countLine++;
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    coundWords += words.length;
                }
            }
            System.out.println("-" + coundWords);
            System.out.println(countLine);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void copyObject() {
        Person person = new Person("John", 101);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./resources/person.dat"))) {
            oos.writeObject(person);
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("I/O Exception: " + e.getMessage());
            e.printStackTrace();
        }
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./resources/person.dat"))
        ) {
            Person person_copy = (Person) ois.readObject();
            System.out.println(person_copy);
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("I/O Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void copyFile(Path path) {
        try (
                FileInputStream fis = new FileInputStream(path.toString());
                FileOutputStream fos = new FileOutputStream("./resources/shelty sheep dog_copy.jpg")
        ) {
            int input;
            while ((input = fis.read()) != -1) {
                fos.write(input);
            }

            byte[] buffer = new byte[8192]; // 8 KB buffer  // ---------------------------
            int bytesRead;                                  // ---------------------------
            while ((bytesRead = fis.read(buffer)) != -1) {  // ---------------------------
                fos.write(buffer, 0, bytesRead);        // ---------------------------
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Ошибка ввода/вывода: " + e.getMessage());
            e.printStackTrace();
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
