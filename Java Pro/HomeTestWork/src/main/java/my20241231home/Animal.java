package my20241231home;

import java.sql.SQLOutput;

public class Animal extends Run{
    public void eat(){
        System.out.println("This animal eat foods");
    }
    public void sound(){
        System.out.println("Some sound");
    }

    @Override
    void run() {
        System.out.println("run");
    }
}
