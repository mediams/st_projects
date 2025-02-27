package my20250121home.annotations1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("my20250121home.annotations1.Person");
        Field[] declaredFields = aClass.getDeclaredFields();
        Object object = aClass.getDeclaredConstructor().newInstance();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(MyAnnotation.class)) {
                field.setAccessible(true);
                MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
                System.out.println(annotation.value() + ", " + field.get(object));
            } else {
                field.setAccessible(true);
                System.out.println(field.getName() + ", " + field.get(object));
            }
        }

        Car car = new Car();
        Inject.injectEngine(car);
        System.out.println(car);

        Comparator<Integer> tComparator = (a, b) -> a - b;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.element());

        Queue<Integer> integerQueue = new ArrayDeque<>();
        integerQueue.iterator();
        List<String> stringList = new LinkedList<>();
        stringList.iterator();
        Set<Object> objects = new TreeSet<>();
        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
