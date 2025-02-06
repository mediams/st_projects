package my20250117home;

public class Example {
    private String name;
    private int num;

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    public void show(){
        System.out.println("test");
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public Example(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
