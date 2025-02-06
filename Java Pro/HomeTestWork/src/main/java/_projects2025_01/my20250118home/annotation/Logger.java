package _projects2025_01.my20250118home.annotation;

import java.lang.reflect.Method;

public class Logger {
    public static void main(String[] args) throws Exception {
        Service service = new Service();

        for (Method method : Service.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Loggable.class)) {
                System.out.println("Вызов метода: " + method.getName());
                method.invoke(service); // Выполняем метод
                System.out.println("Метод " + method.getName() + " выполнен");
            }
        }
        Class<Logger> loggerClass = Logger.class;
        Method method = loggerClass.getDeclaredMethod("value");
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("Gefundet");
            System.out.println("Value is: " + annotation.value());
        }
    }

    @MyAnnotation (value = "Пример")
    public static void myMethod() {
    }
}

