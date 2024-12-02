package my20241129summary;

import java.io.File;
import java.io.IOException;

public class Iostream {
    public static void main(String[] args) {
        File fileOrOrder = new File("I:\\_Starta Institut\\Java Pro\\file");
        System.out.println(fileOrOrder.exists());
        System.out.println(fileOrOrder.isFile());

        fileOrOrder = new File("I:\\_Starta Institut\\Java Pro\\newFile");

        System.out.println("");
        fileOrOrder.mkdirs();
        System.out.println(fileOrOrder.exists());
        System.out.println(fileOrOrder.getAbsolutePath());

    }

}
