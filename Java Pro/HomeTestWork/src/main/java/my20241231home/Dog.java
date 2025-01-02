package my20241231home;

public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }

    @Override
    public void sound() {
        System.out.println("Gav!");
    }

    public static void test(){
        System.out.println("Just Test");
    }
}
