package _projects2024_12.my20241205home.my20241205practise;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortStream_4 {
    public static void main(String[] args) {
//        Отсортируйте стримы по рейтингу от наибольшего к наименьшему и запишите результаты в новый файл.
        Path path = Paths.get("HomeTestWork", "src", "_projects2024_12/my20241205home/my20241205practise", "f.txt");
        Path outputPath = Paths.get("HomeTestWork", "src", "_projects2024_12/my20241205home/my20241205practise", "f_sort.txt");
        Pattern pattern = Pattern.compile("Стрим (\\d+)], (\\d+\\.\\d+)");

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()));
                FileWriter writer = new FileWriter(outputPath.toString())
                ) {
            List<StreamData> streamDataList = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String value = matcher.group(2);
                    streamDataList.add(new StreamData(matcher.group(1), Double.parseDouble(value)));
                }
            }
            streamDataList.sort((o1, o2) -> Double.compare(o2.getData(), o1.getData()));
            writer.write(streamDataList.toString());
            System.out.println(streamDataList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
