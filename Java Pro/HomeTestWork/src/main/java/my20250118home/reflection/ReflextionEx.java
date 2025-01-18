package my20250118home.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflextionEx {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> newClass = Class.forName("my20250118home.reflection.Example");
        Constructor<?> constructor = newClass.getConstructor(String.class, int.class);
        Object newObject = constructor.newInstance("New class", 1);
        System.out.println(newObject);
        Field[] declaredFields = newObject.getClass().getDeclaredFields();
        Arrays.stream(declaredFields).forEach(field -> {
            field.setAccessible(true);
            System.out.print(field.getName() + ": ");
            try {
                System.out.print(field.get(newObject));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            System.out.println(", " + field.getModifiers() + " Modifer");


        });
        try {

            Field field = newObject.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(newObject, "Change");
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        System.out.println(newObject);

        System.out.println("==============");
        Method[] declaredMethods = newObject.getClass().getDeclaredMethods();
        Arrays.stream(declaredMethods)
                .forEach(System.out::println);

        System.out.println("==============");
        int modifiers = newObject.getClass().getModifiers();
        System.out.println(modifiers);

        Constructor<Example> constructorNew = Example.class.getConstructor();
        Example example = constructorNew.newInstance();
        System.out.println(example);

    }
}
