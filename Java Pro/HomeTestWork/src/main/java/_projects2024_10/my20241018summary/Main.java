package _projects2024_10.my20241018summary;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        NewBox newBox = new NewBox();
        newBox.addRectangleArea(25);
        newBox.addRectangleArea(30);


        for (Integer area : newBox) {
            System.out.println("Rectangle Area: " + area);
        }

        Box box = new Box("A", "B", "C");

        Iterator<String> iterator = box.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RectangleArrayList rectangleArrayList = new RectangleArrayList(array);

        Iterator<Integer> iteratorNum = rectangleArrayList.iterator();
        while (iteratorNum.hasNext()){
            System.out.println(iteratorNum.next());
        }
    }
}

//Имеется класс RectangleArrayList, данные в котором хранятся в двумерном массиве
//public class RectangleArrayList {
//    private int[][] data;
//}
//Реализовать для него итератор.
