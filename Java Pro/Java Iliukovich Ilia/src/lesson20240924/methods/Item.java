package lesson20240924.methods;

public class Item {

    public static void main(String... args) {
//        varArgMethod("A");
//        varArgMethod("A", "B");
//        varArgMethod("A", "B", "C");
        varArgMethod(args);
    }

    int weight;
    private String name;

    public Item(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int method(String string, Integer integer) {
        return 0;
    }

    public static Integer method(String string) {
        return 0;
    }

    public static String method(Integer integer) {
        return null;
    }

    public static int[] method2(int[] ints) {
        return null;
    }

//    public static void varArgMethod(Integer integer, String... s) {
//        for (String element : s) {
//            System.out.println(element);
//        }
//    }

    public static void varArgMethod(String... s) {
        for (String element : s) {
            System.out.println(element);
        }
    }

//    public static void varArgMethod(String[] s) {
//        for (String element : s) {
//            System.out.println(element);
//        }
//    }


}
