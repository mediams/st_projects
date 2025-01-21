package my20250121home.annotations1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Inject {

    public static void injectEngine(Object obj) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> objClass = obj.getClass();
        Field[] declaredFields = objClass.getDeclaredFields();
        for (Field field : declaredFields){
            if (field.isAnnotationPresent(AutoInject.class)) {
                field.setAccessible(true);
                Class<?> type = field.getType();
                Object objectDependency = type.getDeclaredConstructor().newInstance();
                field.set(obj, objectDependency);

            }
        }


    }
}
