package my20241114class.lambdasanonimusclass;

public class UseA {
    public static void main(String[] args) {
        String data = "Data from main()"; // effectively final

        A a = new A(){
            int count = 0;
            @Override
            public void method(){
                System.out.println("Another message." + count++ + data);
            }
        };

        a.method();
        a.method();

        A a2 = () -> {
            System.out.println("Test " + data);
        };
    }
}
