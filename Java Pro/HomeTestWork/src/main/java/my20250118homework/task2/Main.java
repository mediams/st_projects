package my20250118homework.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> schoolClass = Class.forName("my20250118homework.task2.School");
        Object schoolInstance = schoolClass.getDeclaredConstructor().newInstance();
        Field[] declaredFields = schoolClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(StudentInfo.class)) {
                StudentInfo annotation = field.getAnnotation(StudentInfo.class);

                Student student = Student.class.getConstructor(String.class, String.class, int.class, boolean.class).newInstance(
                        annotation.name(),
                        annotation.surname(),
                        annotation.groupNumber(),
                        annotation.isOnline()
                );

                field.setAccessible(true);
                field.set(schoolInstance, student);
            }
        }

        System.out.println(schoolInstance);
    }
}
