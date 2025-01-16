package my20250116class.reflaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionEx {
    public static void main(String[] args) {
        Integer integer = 1;

        Class<? extends Integer> integerClass = integer.getClass();
        System.out.println(integerClass);
        System.out.println(integerClass.getName());
        System.out.println(integerClass.getCanonicalName());
        System.out.println(integerClass.getSimpleName());

        int i = 1; // not usable
        Class<Integer> intClass = int.class;
        System.out.println(intClass);
        System.out.println(intClass.getName());
        System.out.println(intClass.getSimpleName());
        System.out.println(intClass.getCanonicalName());

        Class<Void> voidClass = void.class;
        System.out.println(voidClass);

        int[] ints = new int[2];
        Class<? extends int[]> arrayClass = ints.getClass();
        System.out.println(arrayClass);
        System.out.println(arrayClass.getName());
        System.out.println(arrayClass.getCanonicalName());
        System.out.println(arrayClass.getSimpleName());

        Integer[] integers = new Integer[2];
        Class<? extends Integer[]> integersClass = integers.getClass();
        System.out.println(integersClass);
        System.out.println(integersClass.getName());
        System.out.println(integersClass.getCanonicalName());
        System.out.println(integersClass.getSimpleName());

        List<String> list = new ArrayList<>();
        Class<? extends List> listClass = list.getClass();
        System.out.println(listClass);
        System.out.println(listClass.getName());
        System.out.println(listClass.getCanonicalName());
        System.out.println(listClass.getSimpleName());

        System.out.println(Arrays.toString(listClass.getConstructors()));
        System.out.println(Arrays.toString(listClass.getDeclaredConstructors()));

        System.out.println(Arrays.toString(listClass.getMethods()));
        System.out.println(Arrays.toString(listClass.getDeclaredMethods()));

        System.out.println(Arrays.toString(listClass.getFields()));
        System.out.println(Arrays.toString(listClass.getDeclaredFields()));

    }
}
