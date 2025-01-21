package my20250118home.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Injector {
    public static void injector(Object object) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> objectClass = object.getClass();
        Field[] declaredFields = objectClass.getDeclaredFields();

        for (Field field: declaredFields){
            if (field.isAnnotationPresent(AutoInject.class)) {
                Object objectNew = field.getType().getDeclaredConstructor().newInstance();
                field.setAccessible(true);
                field.set(object, objectNew);
            }
        }
    }
}
