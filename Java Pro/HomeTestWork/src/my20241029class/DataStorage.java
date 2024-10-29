package my20241029class;


import my20241025summary.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DataStorage implements Comparable<DataStorage> {
    private Data data;
    private Double weight;
    private int version;
    private boolean isActive;

    public DataStorage(Data data, Double weight, int version, boolean isActive) {
        this.data = data;
        this.weight = weight;
        this.version = version;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "\nDataStorage{" +
                "data=" + data +
                ", weight=" + weight +
                ", version=" + version +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public int compareTo(DataStorage another) {
        int result = data.compareTo(another.data);
        if (result == 0) {
            result = this.weight.compareTo(another.weight);
//            result = this.weight < another.weight ? -1 : this.weight == another.weight ? 0 : 1;
        }
        if (result == 0) {
//            result = this.version - another.version;
            result = Integer.compare(this.version, another.version);
        }
        if (result == 0) {
            result = Boolean.compare(isActive, another.isActive);
        }
        return result;
    }

    public static void main(String[] args) {
        List<DataStorage> listItems = new LinkedList<>(List.of());
        listItems.add(new DataStorage(new Data("Data 1", 10), 15.0, 2, true));
        listItems.add(new DataStorage(new Data("Data 1", 9), 15.0, 2, true));
        listItems.add(new DataStorage(new Data("Data 2", 6), 15.0, 2, true));
        listItems.add(new DataStorage(new Data("Data 3", 10), 15.0, 2, true));
        listItems.add(new DataStorage(new Data("Data 3", 10), 15.0, 1, true));
        listItems.add(new DataStorage(new Data("Data 4", 10), 15.0, 2, true));

        List<DataStorage> copy = new ArrayList<>(listItems);
        Collections.sort(copy);
        System.out.println(copy);


    }
}

