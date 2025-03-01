package _projects2024_10.my20241025summary;

public class DataItem implements Comparable<DataItem> {
    private String data;
    private int count;

    public DataItem(String data, int count) {
        this.data = data;
        this.count = count;
    }

    public String getData() {
        return data;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "DataItem{" +
                "data='" + data + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(DataItem o) {
        int compare = data.compareTo(o.data);
        if (compare == 0) {
            return Integer.compare(count, o.count);
        }
        return compare;
    }
}
