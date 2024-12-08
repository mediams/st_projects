package summary20240927.equals;

public class ObjectsCompare {

    public static void main(String[] args) {
        Item item1 = new Item("Item");
        Item item2 = new Item("Item");

        System.out.println(item1 == item2);
        System.out.println(item1.equals(item2));

        Integer i = 10;
        System.out.println(item1.equals(i));
        System.out.println(item1.equals(null));

        Item item3 = new Item(null);
        System.out.println(item1.equals(item3));

        Item item4 = new Item(null);
        System.out.println(item3.equals(item4));
        System.out.println(item3 == item4);


        // primitive types
        System.out.println(1 == 1);
        System.out.println(1.0 == 1.0);
        boolean value = true;
        System.out.println(true == value);
    }



}
