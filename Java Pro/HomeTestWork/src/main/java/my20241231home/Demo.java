package my20241231home;

public class Demo {
    {
        System.out.println("Non static initialization block");
    }
    static {
        System.out.println("static initialization block");
    }

    static class InnerDemo {
        public void demo(){
            System.out.println("Nested class");
        }
    }
}
