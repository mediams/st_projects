package my20250117home;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TaskEx {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException {
        Class<Example> exampleClass = Example.class;
        Example example = exampleClass.getConstructor(String.class, int.class).newInstance("Test", 5);
        Method[] declaredMethods = exampleClass.getDeclaredMethods();
        for (Method method : declaredMethods){
            method.setAccessible(true);
            String string = method.getName();
            System.out.println(string);
            method.invoke(example);
        }

        Class<?> testClass = Class.forName("my20250117home.Example");
        Constructor<?> constructor = testClass.getConstructor(String.class, int.class);
        Object object = constructor.newInstance("Test", 10);
        Field field = object.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(object, "NewTest");
        System.out.println(object);

        Object object1 = Class.forName("my20250117home.Example").getConstructor(String.class, int.class).newInstance("Test 001", 15);
        System.out.println(object1);

        Arrays.stream(object1.getClass().getDeclaredFields())
                .map(Field::getName)
                .forEach(System.out::println);

        System.out.println("=====================");
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field field1:declaredFields){
            System.out.println(field1.getName());
        }
        Arrays.stream(declaredFields).forEach(field1 -> field1.getName());
    }

}
