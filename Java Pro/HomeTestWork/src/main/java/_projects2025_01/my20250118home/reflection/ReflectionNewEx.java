package _projects2025_01.my20250118home.reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionNewEx {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<? extends Example> aClass = Example.class;
        System.out.println(aClass.getName());
        Method[] declaredMethods = aClass.getDeclaredMethods();
        Arrays.stream(declaredMethods)
                .forEach(method -> System.out.println(method.getName()));
        Field[] declaredFields = aClass.getDeclaredFields();
        Arrays.stream(declaredFields)
                .forEach(field -> System.out.println(field.getName()));
        Arrays.stream(declaredFields)
                .forEach(field -> System.out.println(field.getGenericType()));
        Arrays.stream(declaredFields)
                .forEach(field -> System.out.println(Modifier.isPrivate(Modifier.fieldModifiers())));

        Constructor<? extends Example> constructor = aClass.getConstructor(String.class, int.class);
        Example example = constructor.newInstance("New Class", 1);
        Method show = aClass.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke(example);

        System.out.println("===============");
        Class<Example> exampleClass = Example.class;
        Example exampleForMethod = exampleClass.getConstructor(String.class, int.class).newInstance("Test class", 100);
        Method method = exampleClass.getDeclaredMethod("show");
        method.setAccessible(true);
        method.invoke(exampleForMethod);

        System.out.println("===============");
        System.out.println(aClass.getName());

        System.out.println("===============");
        Constructor<Example> constructor1 = exampleClass.getConstructor(String.class, int.class);
        Example example1 = constructor1.newInstance("tesst", 200);
        Method show1 = exampleClass.getDeclaredMethod("show");
        show1.setAccessible(true);
        show1.invoke(example1);
        Field field = exampleClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(example1, "Sergey");
        System.out.println(field.get(example1));

        Method show2 = exampleClass.getDeclaredMethod("staticShow");
        show2.setAccessible(true);
        show2.invoke(null);


    }
}
