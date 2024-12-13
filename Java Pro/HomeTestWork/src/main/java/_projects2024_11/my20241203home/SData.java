package _projects2024_11.my20241203home;

public class SData {
    private String name;
    private double rating;

    public SData(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + ", " + rating;
    }
}