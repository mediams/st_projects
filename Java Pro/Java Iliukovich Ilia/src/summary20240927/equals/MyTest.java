package summary20240927.equals;

import java.util.Objects;

public class MyTest {
    public static void main(String[] args) {
        Item item1 = new Item("Test");
        Item item2 = new Item("Test");
        Item item3 = new Item(new String("Test"));
        Item item4 = new Item(1);

        System.out.println(item1.equals(item2));
        System.out.println(item1.equals(item3));
        System.out.println(item1.equals("Test")); //!
        System.out.println(item1.equals(item4));

//        System.out.println(Objects.equals(item1,item2));
//        System.out.println(Objects.equals(item1,item3));
//        System.out.println(Objects.equals(item1,"Test")); //!
//        System.out.println(Objects.equals(item1,item4));
    }
}
