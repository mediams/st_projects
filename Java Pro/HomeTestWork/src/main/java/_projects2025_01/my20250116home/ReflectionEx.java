package _projects2025_01.my20250116home;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEx {

    public static void main(String[] args) throws Exception {
        Field field = Person.class.getDeclaredField("name");
        System.out.println(field);
        Class<Person> personClass = Person.class;
        for (Method method : personClass.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

    }

//        Class<?> cls = Class.forName("Example");
//        Object obj = cls.getDeclaredConstructor().newInstance();
//        Method method = cls.getMethod("show");
//        method.invoke(obj);
//    }
}

