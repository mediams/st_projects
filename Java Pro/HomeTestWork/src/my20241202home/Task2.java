package my20241202home;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
//        2. Напишите программу для получения списка файлов с расширением .txt из указанной папки.
        File file = new File("I:" + File.separator + "_Starta Institut" + File.separator + "Java Pro");
        File [] txtFiles = file.listFiles(file1-> file1.getName().endsWith(".txt"));
        System.out.println(Arrays.toString(txtFiles));

    }
}
