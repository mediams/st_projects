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

public class FilterStreams_2 {
    public static void main(String[] args) {
        // Отфильтруйте стримы, имеющие рейтинг выше 4.5, и запишите их в новый файл.
//        1: [Стрим 1], 4.0
        Path path = Paths.get("HomeTestWork", "src", "_projects2024_12/my20241205home/my20241205practise", "f.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()))) {
            Pattern pattern = Pattern.compile("Стрим (\\d+)], (\\d+\\.\\d+)");
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

            List<StreamData> stringListThreshold45 = streamDataList.stream()
                    .filter(streamData -> streamData.getData()>4.5)
                    .toList();
            for (StreamData streamData : stringListThreshold45){
                System.out.println("Стрим " + streamData.getName() + ", " + streamData.getData());
            }
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException");
            e.printStackTrace();
        }
    }
}
