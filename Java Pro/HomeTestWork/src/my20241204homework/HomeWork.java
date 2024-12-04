package my20241204homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork {
    public static void main(String[] args) {
//        1. Создайте файл с текстом: "This is my first experience when I work with IO API. I can do everything!"
//        Откройте и прочтите файл, напечатав его содержимое в консоль.

        try {
            FileWriter writer = new FileWriter("fileWithText.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader("fileWithText.txt"));
            writer.write("This is my first experience when I work with IO API.\nI can do everything!");
            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }
    }
}
