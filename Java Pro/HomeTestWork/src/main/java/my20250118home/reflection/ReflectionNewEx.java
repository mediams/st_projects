package my20250118home.reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionNewEx {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
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

    }
}
