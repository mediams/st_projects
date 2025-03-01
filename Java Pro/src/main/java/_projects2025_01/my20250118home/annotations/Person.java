package _projects2025_01.my20250118home.annotations;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Привет, меня зовут " + name);
    }
}

