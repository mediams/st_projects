package _projects2024_11.my20241126class.generics;

public class GenericClass<Parametr, M> {
    private Parametr data;

    public GenericClass(Parametr data) {
        this.data = data;
    }

    public Parametr nonStaticMethod() {
        System.out.println(data);
        System.out.println(data.getClass());
        return data;
    }
    public void nonStaticMethod2(Parametr parametr, M m){
        System.out.println("Input: " + parametr);
        System.out.println(parametr.getClass());
        System.out.println("Input2: " + m);
        System.out.println(parametr.getClass());
    }
}
