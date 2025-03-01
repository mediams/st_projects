package my20250125home.app;

import java.lang.reflect.Field;

public class Injector {
    public static void inject(Object obj) {
        Class<?> clazz = obj.getClass(); // Получаем класс объекта
        Field[] fields = clazz.getDeclaredFields(); // Получаем все поля

        for (Field field : fields) {
            if (field.isAnnotationPresent(AutoInject.class)) { // Проверяем, есть ли аннотация @AutoInject
                try {
                    Object instance = field.getType().getDeclaredConstructor().newInstance(); // Создаём объект
                    field.setAccessible(true); // Разрешаем изменять private поля
                    field.set(obj, instance); // Устанавливаем объект в поле
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
