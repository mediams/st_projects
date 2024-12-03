package my20241203class.io;

import java.io.File;
import java.io.IOException;

public class WriteFileException {
    public static void main(String[] args) throws IOException {
        File file= new File("test.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());

        
    }
}
