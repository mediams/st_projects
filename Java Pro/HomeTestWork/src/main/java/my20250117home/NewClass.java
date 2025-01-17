package my20250117home;

public class NewClass {
    private String name = "secret";
    private int num;

    @Override
    public String toString() {
        return "NewClass{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    public NewClass(int num) {
//        this.name = name;
        this.num = num;
    }
}
