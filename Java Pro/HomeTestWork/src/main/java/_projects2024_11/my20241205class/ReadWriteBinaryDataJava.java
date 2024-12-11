package _projects2024_11.my20241205class;

import java.io.*;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class ReadWriteBinaryDataJava {
    public static void main(String[] args) {
        byte data = 0b101;
//        data = 5;

        try (OutputStream stream = new FileOutputStream(".\\resources\\binaryFile")) {
            stream.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream inputStream = new FileInputStream(".\\resources\\binaryFile")) {
            int input = inputStream.read();
            System.out.println(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = new FileInputStream(".\\resources\\AdobeStock_55929654.jpeg")) {
            int input = inputStream.read();


            for (int i=0; i <= 10; i++) {
                System.out.println(input + ":" + Integer.toHexString(input) + ":" + (char) input);
                input = inputStream.read();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
