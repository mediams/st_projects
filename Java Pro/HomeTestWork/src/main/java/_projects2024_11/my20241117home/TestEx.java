package _projects2024_11.my20241117home;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}

public class TestEx {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                return x + y;
            }
        });

        runner.run((x, y) -> x + y);
    }
}
