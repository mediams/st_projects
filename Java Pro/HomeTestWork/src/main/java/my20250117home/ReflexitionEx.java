package my20250117home;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflexitionEx {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        Class<?> aClass = Class.forName("example");
        Field[] declaredFields = Example.class.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        Constructor<Example> constructor = Example.class.getConstructor(String.class, int.class);
        Example test = constructor.newInstance("Test", 1);
        System.out.println(test);

        var newClass = new NewClass(1);
        Field name = NewClass.class.getDeclaredField("name");
        name.setAccessible(true);
        name.set(newClass, "Non secret");
        System.out.println(name.get(newClass));
        System.out.println(newClass);


    }


    public static class Example {
        private String name;
        private int num;

        public Example(String name, int num) {
            this.name = name;
            this.num = num;
            System.out.println("Constructor created");
        }

        @Override
        public String toString() {
            return "Example{" +
                    "name='" + name + '\'' +
                    ", num=" + num +
                    '}';
        }

        public void method() {
        }
    }
}
