package my20241208homeSerialzable;

import my20241205class.Adress;
import my20241205class.Person;

import java.io.*;

public class MainSerializable {
    public static void main(String[] args) {
        Person person = new Person("Igor", 15, new Adress("City", "Street"));
        try (
//              ByteArrayOutputStream bos = new ByteArrayOutputStream();
                FileOutputStream fout = new FileOutputStream("Test.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);
                FileInputStream fis = new FileInputStream("Test.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            out.writeObject(person);
            Object object = ois.readObject();
            System.out.println(object);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
