package _projects2024_10.my20241025summary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data implements Comparable<Data> {
    private String data;

    private int count;

    public Data(String data, int count) {
        this.count = count;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data='" + data + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Data another) {
        int result = data.compareTo(another.data); // normal method
//        int result = another.data.compareTo(data);// reverse method
        if (result == 0) {
            result = count - another.count; // normal method
//            result = another.count- count;// reverse method
//            return Integer.compare(count, another.count); // normal method
        }
        return result; // data.compareTo(another.data);
    }

    public static void main(String[] args) {
        Data data1 = new Data("USB", 12);
        Data data2 = new Data("TV", 120);
        Data data3 = new Data("Laptop", 18);
        Data data4 = new Data("Monitor", 138);
        Data data5 = new Data("PC", 154);
        Data data6 = new Data("Laptop", 16);

        List<Data> list = new ArrayList<>(List.of(data1, data2, data3, data4, data5, data6));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }


}
