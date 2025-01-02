package my20241231home;

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
    }

}
