package my20250125home;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReflectionEx {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<Person> personClass = Person.class;
        Class<?> aClass = Class.forName("my20250125home.Person");
        System.out.println(personClass.getSimpleName());
        System.out.println(aClass.getSimpleName());

        Field[] declaredFields = personClass.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(field -> {field.setAccessible(true);
            System.out.println(field.getName());});

        Method[] declaredMethods = personClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(method -> {method.setAccessible(true); System.out.println(method.getName());});

        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();

        Arrays.stream(declaredConstructors).forEach(constructor -> {constructor.setAccessible(true); System.out.println(constructor.getName());});

        Person person = personClass.getConstructor().newInstance();
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name.get(person));
        name.set(person, "Lolkin");
        System.out.println(name.get(person));
        personClass.getMethod("sayHello").invoke(person);

        System.out.println("\n===================");
        System.out.println("\n===================");

        System.out.println(json(person));


        System.out.println("\n===================");
        personClass.getMethod("test").invoke(person);

        Field nameField = person.getClass().getDeclaredField("name");
        nameField.setAccessible(true);

        String value = nameField.getAnnotation(JsonElement.class).value();
        System.out.println(value);

    }

    private static String json(Object obj) throws IllegalAccessException {
        Class<?> aClass = obj.getClass();
        if (!aClass.isAnnotationPresent(JsonSerializable.class)) {
            throw new IllegalArgumentException("Object is not a JSON object");
        }

        Map<String, String> jsonElements = new HashMap<>();
        for (Field field : aClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonElement.class)) {
                field.setAccessible(true);
                Object value = field.get(obj);

                if (value instanceof Number) {
                    jsonElements.put(field.getName(), value.toString());
                } else {
                    jsonElements.put(field.getName(), "\"" + value + "\"");
                }
            }
        }

        StringBuilder json = new StringBuilder("{");
        jsonElements.forEach((key, value) -> json.append("\"").append(key).append("\": ").append(value).append(", "));

        if (!jsonElements.isEmpty()) {
            json.delete(json.length() - 2, json.length());
        }

        json.append("}");
        return json.toString();
    }

}

