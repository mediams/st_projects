package my20241205practise;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class SortStream_4 {
    public static void main(String[] args) {
//        Отсортируйте стримы по рейтингу от наибольшего к наименьшему и запишите результаты в новый файл.
        Path path = Paths.get("HomeTestWork", "src", "my20241205practise", "f.txt");
        Pattern pattern = Pattern.compile("Стрим (\\d+)], (\\d+\\.\\d+)");
    }
}
