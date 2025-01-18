package my20250118home.reflection;

public class Example {
    private String name;
    private int num;

    public Example() {
    }

    private void show(){
        System.out.println("Text in method.");
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

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
