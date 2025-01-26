package my20250123home.tasksOCPrinciple;

import java.util.HashMap;
import java.util.Map;

public class TasksEx {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("Java", "Programming language");

        String result1= stringMap.getOrDefault("Java", "Not found");
        System.out.println(result1);

        String result2 = stringMap.getOrDefault("Python", "Not found");
        System.out.println(result2);

    }
}
