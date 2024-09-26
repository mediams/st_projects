package lesson20240926.parentchildinit;

public class Child extends Parent {

    public String nonStaticValue = "Child nonStaticValue";

    public static String staticValue = "Child StaticValue";

    {
        System.out.println("Child non-static init block");
    }

    static {
        System.out.println("Child static init block");
    }

    public Child() {
//        super();
        System.out.println("Child constructor");
    }

    public void nonStaticMethod() {
        System.out.println("Child nonStaticMethod");
        System.out.println(this.nonStaticValue);
        System.out.println(super.nonStaticValue);
//        Parent.staticMethod(); -- possible
    }

    public static void staticMethod() {
        System.out.println("Child StaticMethod");
        System.out.println(staticValue);
//        nonStaticMethod(); -- impossible
    }

}
