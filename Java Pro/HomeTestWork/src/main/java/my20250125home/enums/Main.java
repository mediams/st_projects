package my20250125home.enums;

public class Main {
    public static void main(String[] args) {
        Color myColor = Color.BLUE;
        System.out.println(myColor);

        System.out.println(myColor==Color.BLUE);
        System.out.println(myColor==Color.RED);
        System.out.println(myColor==Color.GREEN);
        System.out.println(myColor.equals(Color.BLUE));
        System.out.println(myColor.equals(Color.RED));
        System.out.println(myColor.equals(Color.GREEN));

        for (Color c : Color.values()) {

            System.out.println(c);
        }

        for (Hauses h : Hauses.values()) {
            switch (h) {
                case FIFTH -> {
                    System.out.println("FIFTH");
                    System.out.println(h.getAge());
                }
            }
        }
    }
}
