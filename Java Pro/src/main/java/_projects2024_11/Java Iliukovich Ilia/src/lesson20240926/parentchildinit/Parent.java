package lesson20240926.parentchildinit;

public class Parent {

    public String nonStaticValue = "Parent nonStaticValue";

    public static String staticValue= "Parent StaticValue";

    {
        System.out.println("Parent non-static init block");
    }

    static {
        System.out.println("Parent static init block");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }

    public void nonStaticMethod() {
        System.out.println("Parent nonStaticMethod");
        System.out.println(nonStaticValue);
    }

    public static void staticMethod() {
        System.out.println("Parent StaticMethod");
        System.out.println(staticValue);
    }




}
