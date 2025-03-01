package _projects2024_10.my20241015practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayHuman {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 22);
        Human human2 = new Human("Max", 23);
        Human human3 = new Human("Stiven", 25);
        Human human4 = new Human("Ella", 32);
        Human human5 = new Human("Max", 13);
        Human human6 = new Human("Bob", 25);

        ArrayList<Human> humanArrayList = new ArrayList<>();
        humanArrayList.add(human1);
        humanArrayList.add(human3);
        humanArrayList.add(human6);

        // not modify
        List<Human> humanArrayList2 = List.of(human1, human2, human3, human4, human5, human6);

        ArrayList<Human> newArrayList = new ArrayList<>(humanArrayList2);
        newArrayList.add(human3);
        System.out.println(newArrayList);

        //altere Method - auch nicht modifeien
        List<Human> arr4 = Arrays.asList(human1, human2);
        System.out.println(arr4);

        List<Human> arr5 = new ArrayList<>(Arrays.asList(human3, human4));
        System.out.println(arr5);

        for (Human h : humanArrayList2) {
            if (h.getAge() == 25) {
                System.out.println(h.getName());
            }
        }

        System.out.println(humanArrayList);
//        for (int i = 0; i < humanArrayList.size(); i++) {
//            if (humanArrayList.get(i).getAge() == 25) {
//                humanArrayList.remove(i);
//                i--;
//            }
//        }

        Iterator<Human> iterator = humanArrayList.iterator();
        while (iterator.hasNext()) {
            Human h = iterator.next();
            if (h.getAge() == 25) {
                iterator.remove();
            }
        }
        System.out.println(humanArrayList);
    }
}
