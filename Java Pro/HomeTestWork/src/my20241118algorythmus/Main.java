package my20241118algorythmus;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(10);
        System.out.println(dynamicArray);
        dynamicArray.add(15);

//        dynamicArray.reSize();
        dynamicArray.add(15);
        System.out.println(dynamicArray);
        dynamicArray.add(9);
        dynamicArray.add(16);
        dynamicArray.add(20);
        System.out.println(dynamicArray);
        dynamicArray.add(20);
        dynamicArray.add(22);
        dynamicArray.add(22);
        dynamicArray.remove();
        dynamicArray.remove();
        System.out.println(dynamicArray);


    }
}