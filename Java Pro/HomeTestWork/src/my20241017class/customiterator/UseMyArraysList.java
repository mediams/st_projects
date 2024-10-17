package my20241017class.customiterator;

public class UseMyArraysList {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(new String[]{"A", "B", "C", "D"});

        for (String s : myArrayList) {
            String element = s;
            System.out.println(element);
        }
    }
}
