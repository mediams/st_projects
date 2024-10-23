package my20241023homework;

class OuterClass {
    // Статический вложенный класс
    static class StaticNestedClass {
        public void display() {
            System.out.println("Я статический вложенный класс");
        }
    }

    // Внутренний класс
    class InnerClass {
        public void display() {
            System.out.println("Я внутренний класс");
        }
    }

    // Метод, который использует анонимный класс
    public void createAnonymousClass() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Я анонимный класс, реализующий интерфейс Runnable");
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        // Создаем экземпляр статического вложенного класса
        OuterClass2.StaticNestedClass staticNested = new OuterClass2.StaticNestedClass();
        staticNested.display();

        // Создаем экземпляр внутреннего класса
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.display();

        // Используем анонимный класс
        outer.createAnonymousClass();
    }
}

