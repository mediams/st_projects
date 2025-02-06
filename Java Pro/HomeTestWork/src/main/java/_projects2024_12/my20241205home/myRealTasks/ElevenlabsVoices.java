package _projects2024_12.my20241205home.myRealTasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElevenlabsVoices {
    public static void main(String[] args) throws IOException {
        {
            Path path = Paths.get("I:\\_Starta Institut\\Java Pro\\HomeTestWork\\src\\myRealTasks\\values.txt");
            try (Stream<String> streamFromFiles = Files.lines(path)) {
                String content = Files.readString(Paths.get(path.toUri()));
                // Регулярное выражение для поиска значений name='...'
                Pattern pattern = Pattern.compile("name='(.*?)'");
                Matcher matcher = pattern.matcher(content);


                // Сохраняем все найденные имена в список
                List<String> names = matcher.results()
                        .map(match -> match.group(1))
                        .collect(Collectors.toList());


                // Вывод результата
                names.stream().distinct().forEach(System.out::println);

            } catch (IOException e) {
                System.err.println("Ошибка при чтении файла: " + e.getMessage());
            }
        }
    }
}
