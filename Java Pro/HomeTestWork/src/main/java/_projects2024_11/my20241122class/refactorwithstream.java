package _projects2024_11.my20241122class;

import _projects2024_11.my20241120homework.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class refactorwithstream {
    public static List<String> method(List<String> strings) {
        List<String> result = new ArrayList<>(); // 0(n*2)
//        for (String s : strings) { // n
//            if (!result.contains(s)) { // n
//                result.add(s);
        return strings.stream().distinct().collect(Collectors.toCollection(ArrayList::new)); // 0(n)
    }

    public static void feed(List<Cat> catList) {
//        for (int i = 0; i < catList.size(); i++) {
//            if (catList.get(i).isHungry()) {
//                catList.get(i).setHungry(false);
        catList.stream().filter(Cat::isHungry).forEach(cat -> cat.setHungry(false)); // read -> write more effective
        catList.forEach(cat -> cat.setHungry(false)); // write

    }
}