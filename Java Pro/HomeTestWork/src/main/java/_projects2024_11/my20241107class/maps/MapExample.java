package _projects2024_11.my20241107class.maps;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map = new HashMap<>(16, 0.5f);
        map.put("A", 10);
        map.put("B", 20);
        map.put("G", 15);
        System.out.println(map.get("G"));
        map.put("G", 20);
        System.out.println(map.get("G"));
        System.out.println(map);
        System.out.println(map.containsKey("B")); //O(1)
        System.out.println(map.containsValue(50)); // O(n)

        Set<String> strings = map.keySet();
        System.out.println(strings);

        Collection<Integer> values = map.values();
        System.out.println(values);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", value: " + value);
        }

        map.remove("G");

        System.out.println(map);
    }
}
