package my20241202home;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
//        3. Напишите программу, чтобы получить размер файла в байтах, КБ, МБ.
        File file = new File("I:" + File.separator + "_Starta Institut" + File.separator + "Java Pro");
        long bytes = file.length();

        System.out.println(bytes + "bytes");
        System.out.println(bytes / 1024 + "kb");
        System.out.println(bytes /1024 / 1024 + "Mb");

    }
}
