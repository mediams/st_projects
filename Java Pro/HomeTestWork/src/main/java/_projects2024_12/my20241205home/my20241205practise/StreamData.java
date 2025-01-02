package _projects2024_12.my20241205home.my20241205practise;

public class StreamData {
    String name;
    double data;

    public StreamData(String name, double data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public double getData() {
        return data;
    }

    @Override
    public String toString() {
        return "StreamData{" +
                "name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
