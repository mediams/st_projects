package my20250118home.adding;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> person = Class.forName("my20250118home.adding.Person");
        System.out.println(person.getSimpleName());
        Field[] declaredFields = person.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(field -> System.out.println(field.getName()));
        Method[] declaredMethods = person.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(method -> System.out.println(method.getName()));
        Constructor<?>[] constructors = person.getConstructors();
        Arrays.stream(constructors).forEach(constructor -> System.out.println(constructor.getName()));

        System.out.println("======================");
        Constructor<?> constructor = person.getConstructor(String.class, int.class);
        Object personIgor = constructor.newInstance("Igor", 25);
        Method methodGreet = personIgor.getClass().getDeclaredMethod("greet");
        methodGreet.invoke(personIgor);

        Field name = person.getDeclaredField("name");
        name.setAccessible(true);
        name.set(personIgor, "John");
        System.out.println(personIgor);
    }
}
