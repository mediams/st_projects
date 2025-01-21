package my20250121class;

import java.util.ArrayList;
import java.util.List;

public class ReflectionEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println(list.getClass() == ArrayList.class);
        System.out.println(list.getClass().equals(ArrayList.class));
        System.out.println(list.getClass() == List.class);
        System.out.println(list.getClass().equals(List.class));
    }
}
