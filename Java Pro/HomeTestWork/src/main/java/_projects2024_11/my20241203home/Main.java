package _projects2024_11.my20241203home;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BReader reader = new BReader();

        // Чтение файла
        reader.readFileAndSaveInList("I:\\_Starta Institut\\Java Mikhail Egorov\\090724-m-be\\src\\main\\java\\com\\app\\_03_12_2024\\fileReader\\f.txt");

        reader.printData();

        System.out.println(reader.filterByRate(4.5));
        List<SData> filteredList = reader.filterByRate(4.5);
        try (BufferedWriter filterByRate = new BufferedWriter(new FileWriter("filterByRate"))) {
            for (SData data : filteredList) {
                filterByRate.write(data.toString());  // Предполагается, что у SData переопределён метод toString
                filterByRate.newLine();               // Переход на новую строку для каждого элемента
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        // Подсчет среднего рейтинга
//        double averageRating = reader.calculateAverageRating();
//        System.out.println("Средний рейтинг: " + averageRating);
//
//        // Запись среднего рейтинга в файл
//        reader.writeAverageToFile("average_rating.txt", averageRating);
//
//        // Фильтрация стримов с рейтингом > 4.5
//        List<SData> filteredStreams = reader.filterStreamsByRating(4.5);
//
//        // Запись отфильтрованных стримов в файл
//        reader.writeToFile("filtered_streams.txt", filteredStreams);


    }
}
