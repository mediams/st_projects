package _projects2024_12.my20241205home.my20241231home;

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
