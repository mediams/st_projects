package lesson20240924.init;

public class Start {

    private Integer number;

    public Start() {
        this(1000);
        System.out.println("Constructor with no arg at work");
    }

    public Start(Integer number) {
        System.out.println("Constructor with 1 arg at work");
        this.number = number;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Start s = new Start();
        System.out.println(s.number);
        System.out.println(s);
//
//        Start s2 = new Start();
//        s2.number = 100;
//
//        System.out.println(s.number);
//        System.out.println(s2.number);
//
//        Start s3 = new Start(777);
    }

    @Override
    public String toString() {
        return "String representation of the object, number = " + number;
    }

}
