package my20241126class.generics;

import java.lang.reflect.Parameter;

public class UseGenerics {
    public static void main(String[] args) {

        GenericClass<String, Integer> genericClass = new GenericClass<>("String value");

        String result = genericClass.nonStaticMethod();
        System.out.println(result);

        genericClass.nonStaticMethod2("String data", 20);

        GenericClass<Double, Boolean> genericClass2 = new GenericClass<>(20.0);
        System.out.println(genericClass2.nonStaticMethod());
        genericClass2.nonStaticMethod2(10.0, true);

        System.out.println(staticGenericMethod(1));
        staticGenericMethod("String");
        staticGenericMethod(false);

//        Parameter result = staticGenericMethod2("Example Input");


    }

    public static <T> T staticGenericMethod(T t) {
        if (t instanceof Integer) {
            System.out.println("Logic for integer");
            return (T) (Integer) (((Integer) t) + 100);
        } else if (t instanceof String) {
            System.out.println("String action with: " + t);
            return t;
        }

        System.out.println(t);
        return t;
    }

    public <K> Parameter staticGenericMethod2(K k) {
        System.out.println(data);
        System.out.println(k);
        return data;
    }
}
