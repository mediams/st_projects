package my20250116class.reflaction;

public class Data {
    private final String name;
    private int i;

    public Data(String name, int i) {
        this.name = name;
        this.i = i;
    }
    public void publickMethod(){
        System.out.println("PublicMethod, calls process data: ");
        System.out.println(processData());
    }

    private String processData(){
        return "Data processed from " + this;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", i=" + i +
                '}';
    }

    public static void main(String[] args) {


    }
}
