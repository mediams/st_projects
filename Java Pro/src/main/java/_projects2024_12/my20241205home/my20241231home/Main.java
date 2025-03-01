package _projects2024_12.my20241205home.my20241231home;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.sound();

        Demo demo = new Demo();
        Demo demo1 = new Demo();


        Demo.InnerDemo innerDemo = new Demo.InnerDemo();
        innerDemo.demo();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        };

        new Thread(task).start();

        Run run = new Run() {
            @Override
            void run() {

            }
        };

        demo.runStart();
        demo.run();

        Dog.test();
    }

}
