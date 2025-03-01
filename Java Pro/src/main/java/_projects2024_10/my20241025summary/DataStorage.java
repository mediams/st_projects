package _projects2024_10.my20241025summary;

public class DataStorage implements Comparable<DataStorage> {
    DataItem data;
    Double weight;
    int version;
    boolean isActive;

    public DataStorage(DataItem data, Double weight, int version, boolean isActive) {
        this.data = data;
        this.weight = weight;
        this.version = version;
        this.isActive = isActive;
    }

    public DataStorage(Double weight, int version, boolean isActive) {
        this.weight = weight;
        this.version = version;
        this.isActive = isActive;
    }

    public DataItem getData() {
        return data;
    }

    public Double getWeight() {
        return weight;
    }

    public int getVersion() {
        return version;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "\n\tDataStorage{" +
                "data=" + data +
                ", weight=" + weight +
                ", version=" + version +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public int compareTo(DataStorage o) {
        int compare = data.compareTo(o.data);
        if (compare != 0) return compare;

        compare = Double.compare(weight, o.weight);
        if (compare != 0) return compare;

        compare = Integer.compare(version, o.version);
        if (compare != 0) return compare;

        return Boolean.compare(this.isActive, o.isActive);
    }
}
