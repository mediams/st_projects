package my20250125home.enums;

public enum Hauses {
    FIRST(541, 22),
    SECOND(541, 22),
    THIRD(541, 22),
    FOURTH(541, 22),
    FIFTH(541, 22),
    SIFTH(541, 22),
//

    ADD {
        @Override
        public int apply(int a, int b) { return a + b; }
    },
    SUBTRACT {
        @Override
        public int apply(int a, int b) { return a - b; }
    };

    private final int employees;
    private final int age;

    Hauses(int employees, int age) {
        this.employees = employees;
        this.age = age;
    }

    Hauses() {

    }


    public int getEmployees() {
        return employees;
    }

    public int getAge() {
        return age;
    }
    public int apply(int a, int b) {
        throw new UnsupportedOperationException("Operation not supported for houses");
    }
}
