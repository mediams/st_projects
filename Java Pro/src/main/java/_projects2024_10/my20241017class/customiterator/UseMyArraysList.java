package _projects2024_10.my20241017class.customiterator;

public class UseMyArraysList {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(new String[]{"A", "B", "C", "D"});
//        MyArrayList myArrayList = new MyArrayList(new String[]{"A"});
//        MyArrayList myArrayList = new MyArrayList(new String[]{});

        for (String s : myArrayList) {
            String element = s;
            System.out.println(element);
        }

//        Iterator<String> iterator = myArrayList.iterator();
//        System.out.println(iterator.next());
    }
}
