import my20250118home.annotation.Logger;
import my20250118home.annotation.MyAnnotation;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        // Получаем метод myMethod() из класса Logger
        Method method = Logger.class.getDeclaredMethod("myMethod");

        // Проверяем, есть ли у метода аннотация @MyAnnotation
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            // Получаем саму аннотацию
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

            // Выводим значение аннотации
            System.out.println("Аннотация @MyAnnotation найдена!");
            System.out.println("Значение value: " + annotation.value());
        } else {
            System.out.println("Аннотация @MyAnnotation не найдена.");
        }
    }
}
