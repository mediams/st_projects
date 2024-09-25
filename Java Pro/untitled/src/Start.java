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

        Start s = new Start(1000);
        Start s1 = new Start();
        System.out.println(s.number);
//        Test t = new Test();
//        System.out.println(t.getNumber());

    }
}

