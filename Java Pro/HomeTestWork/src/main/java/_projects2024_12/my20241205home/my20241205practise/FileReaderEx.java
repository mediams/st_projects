package _projects2024_12.my20241205home.my20241205practise;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader("222.txt")) {
            int characters;
            while ((characters = fileReader.read()) != -1) {
                System.out.print((char) characters);
            }

            System.out.println("\n");
            System.out.println("Done");
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }
}
