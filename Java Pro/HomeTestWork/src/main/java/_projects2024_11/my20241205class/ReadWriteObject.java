package _projects2024_11.my20241205class;

import java.io.*;

public class ReadWriteObject {
    public static void main(String[] args) {
        Person person = new Person("Tom", 24, new Adress("Moscow", "Street str"));

        byte[] byteArray = null;

//        try (ByteArrayOutputStream out = new ByteArrayOutputStream(); ObjectOutputStream outputStream = new ObjectOutputStream(out)) {
        try (FileOutputStream out = new FileOutputStream(".\\resources\\save.txt");
             ObjectOutputStream outputStream = new ObjectOutputStream(out)) {

            outputStream.writeObject(person);
//            byteArray = out.toByteArray();

//            System.out.println(Arrays.toString(byteArray));
//
//            for (int i = 0; i < byteArray.length; i++) {
//                System.out.print((char) byteArray[i] + " ");
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        try (FileInputStream in = new FileInputStream(".\\resources\\save.txt");
             ObjectInputStream inputStream = new ObjectInputStream(in)) {
            person = (Person) inputStream.readObject();
            System.out.println(person);
//            System.out.println( person == deserilayedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

//        try (
//                ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray);
//                ObjectInputStream objectInputStream = new ObjectInputStream((inputStream));
//        ) {
//            Person deserilayedPerson = (Person) objectInputStream.readObject();
//            System.out.println(deserilayedPerson);
//            System.out.println( person == deserilayedPerson);
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

    }
}
