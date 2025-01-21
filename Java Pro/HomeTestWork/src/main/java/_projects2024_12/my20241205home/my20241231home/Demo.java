package _projects2024_12.my20241205home.my20241231home;

public class Demo extends Run {
    {
        System.out.println("Non static initialization block");
    }
    static {
        System.out.println("static initialization block");
    }

    @Override
    void run() {
        System.out.println("Test Run!");
    }

    static class InnerDemo {
        public void demo(){
            System.out.println("Nested class");
        }
    }
}
