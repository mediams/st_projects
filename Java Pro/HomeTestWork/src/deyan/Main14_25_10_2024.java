package deyan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.example.Summary14_25_10_2024.DataStorage;

public class Main14_25_10_2024 {
    public static void main(String[] args) {

        DataStorage.Data data1 = new DataStorage.Data("stick", 12);
        DataStorage.Data data2 = new  DataStorage.Data("book", 23);
        DataStorage.Data data3 = new DataStorage.Data("coffee", 11);
        DataStorage.Data data4 = new DataStorage.Data("coffee", 12);
        DataStorage.Data data5 = new DataStorage.Data("box", 32);
        DataStorage.Data data6 = new DataStorage.Data("box", 32);

        DataStorage d1 = new DataStorage(data1,2.3,2,true);
        DataStorage d2 = new DataStorage(data2,2.4,1,true);
        DataStorage d3 = new DataStorage(data3,2.5,3,false);
        DataStorage d4 = new DataStorage(data4,2.6,5,true);
        DataStorage d5 = new DataStorage(data5,2.7,11,false);
        DataStorage d6 = new DataStorage(data6,2.7,11,true);

        List<DataStorage> list = new ArrayList<>(List.of(d1, d2, d3, d4, d5, d6));


        Collections.sort(list);
        System.out.println(list);




    }
}
