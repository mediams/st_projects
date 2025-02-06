package _projects2025_01.my20250116class.reflaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UseData {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {
        var data = new Data("Laptop", 2);

        data.publickMethod();
        System.out.println(data);

        Class<? extends Data> dataClass = data.getClass();
        System.out.println(Arrays.toString(dataClass.getDeclaredFields()));
        Field field = dataClass.getDeclaredField("name");
        field.setAccessible(true);
        String dataFromField = (String) field.get(data);
        System.out.println(dataFromField);
        field.set(data, "PC");

        System.out.println(data);

        System.out.println(Arrays.toString(dataClass.getDeclaredMethods()));
        Method method = dataClass.getDeclaredMethod("processData");
        method.setAccessible(true);
        String result = (String) method.invoke(data);
        System.out.println(result);

        Class<?> forName = Class.forName("_projects2025_01.my20250116class.reflaction.Data");
        Constructor<?> constructor = forName.getConstructor(String.class, int.class);
        Data iphone = (Data) constructor.newInstance("Iphone", 5);
        System.out.println(iphone);

    }
}
