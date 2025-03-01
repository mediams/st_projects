package _projects2024_12.my20241205home.my20241205practise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CountStream_3 {
    public static void main(String[] args) {
//        Сгруппируйте стримы по названию и запишите количество стримов в каждой группе в новый файл.

        Path path = Paths.get("HomeTestWork", "src", "_projects2024_12/my20241205home/my20241205practise", "f.txt");
        String text = "1: [Стрим 1], 4.0";
        Pattern pattern = Pattern.compile("Стрим (\\d+).+?(\\d+\\.\\d+)");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()))) {
            String line;
            List<StreamData> streamDataList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String key = matcher.group(1);
                    double value = Double.parseDouble(matcher.group(2));
                    streamDataList.add(new StreamData(key, value));
                }
            }
            System.out.println(streamDataList);
            streamDataList.stream()
                    .collect(Collectors.groupingBy(StreamData::getName, Collectors.counting()))
                    .forEach((key, value) -> System.out.println("Stream: " + key + ", count: " + value));
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException");
            e.printStackTrace();
        }
    }
}
