package _projects2024_11.my20241203home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BReader {
    public List<SData> sDataList = new ArrayList<>();

    public void readFileAndSaveInList(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;

            while ((line = reader.readLine()) != null) {
                SData sData = createSDATA(line);
                sDataList.add(sData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private SData createSDATA(String line) {
        try {
            String[] parts = line.split(",");
            String name = parts[0].split(":")[1].trim();
            double rating = Double.parseDouble(parts[1].trim());
            return new SData(name, rating);
        } catch (Exception e) {
            return null;
        }
    }

    public void printData() {
        System.out.println(sDataList);
    }

    public List<SData> filterByRate(double threshold) {
        List<SData> filtered = new ArrayList<>();
//        for (SData sData : sDataList) {
//            if (sData.getRating() > threshold) {
//                filtered.add(sData);
//            }
//        }
        return sDataList.stream()
                .filter(SDate -> SDate.getRating() > 4.5).toList();
    }
}