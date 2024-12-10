package my20241205practise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AvgAllStreams_1 {
    public static void main(String[] args) {
//        Прочитайте файл и посчитайте средний рейтинг всех стримов. Запишите результат в новый файл.
//        1: [Стрим 1], 4.0
        Path path = Paths.get("HomeTestWork", "src", "my20241205practise", "f.txt");
        String text = "1: [Стрим 1], 4.0";
        Pattern pattern = Pattern.compile("Стрим (\\d+).+?(\\d+\\.\\d+)");

//        if (matcher.find()) {
//            System.out.println(matcher.group());
//        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()))) {
            String line;
            int i = 0;
            HashMap<String, List<String>> map = new HashMap<>();
            while ((line = bufferedReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String key = matcher.group(1);
                    String value = matcher.group(2);

                    map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
                }
            }
            Map<String, Double> averages = map.entrySet()
                    .stream()
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            entry -> entry.getValue()
                                    .stream()
                                    .mapToDouble(value -> Double.parseDouble(value)) // Преобразуем строки в Double
                                    .average()
                                    .orElse(0.0)
                    ));

            System.out.println(map);
            for (Map.Entry<String, Double> entry : averages.entrySet()) {
                System.out.println("Стрим " + entry.getKey() + ", AVG=" + entry.getValue());
            }

            double overallAverage = averages.values()
                    .stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0.0);

            overallAverage = Math.round(overallAverage * 100.0) / 100.0;

            System.out.println("Средняя по всем AVG: " + overallAverage);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File IO error!");
            e.printStackTrace();
        }
    }
}
