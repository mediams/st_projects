package my20250117home;

import java.lang.reflect.*;

public class ReflexitionEx {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        var newClass = new NewClass(1);
        Field name = newClass.getClass().getDeclaredField("name");
        name.setAccessible(true);
        name.set(newClass, "New data");
        System.out.println(name.get(newClass));
        System.out.println(newClass);
        System.out.println(newClass.getClass().getName());

        Field[] declaredFields = NewClass.class.getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            System.out.println(field.getName());
            System.out.println(field.get(newClass));
        }

        Class<?> newClassOne = Class.forName("my20250117home.NewClass");
        Constructor<?> constructor = newClassOne.getConstructor(int.class);
        Object object = constructor.newInstance(1);
        System.out.println(object);
        Method show = object.getClass().getMethod("show");
        show.setAccessible(true);
        show.invoke(object);

        System.out.println("=======================");
        Field[] declaredFields1 = NewClass.class.getDeclaredFields();
        for (Field field : declaredFields1) {
            field.setAccessible(true);
            System.out.println(field.getModifiers());
            System.out.println(field.get(newClass));
        }

        Class<NewClass> newClassClass = NewClass.class;
        Constructor<?>[] constructors = newClassClass.getConstructors();
        for (Constructor constructor1 : constructors){
            constructor1.newInstance(1);
        }
        Method[] declaredMethods = newClassClass.getDeclaredMethods();
        for (Method method:declaredMethods){
            System.out.println(method.getName());
        }



    }

}