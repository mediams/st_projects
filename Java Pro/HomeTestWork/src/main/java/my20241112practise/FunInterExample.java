package my20241112practise;

@FunctionalInterface
interface FunInterface {
    void fun();
}

public class FunInterExample {
    public static void main(String[] args) {
        // Создание анонимного класса, реализующего FunInterface
        FunInterface funInterface = new FunInterface() {
            @Override
            public void fun() {
                System.out.println("!!!!");
            }
        };

        // Вызов метода get, передавая в него реализацию FunInterface
        new FunInterExample().get(funInterface);
    }

    public void get(FunInterface f) {
        f.fun();
    }
}