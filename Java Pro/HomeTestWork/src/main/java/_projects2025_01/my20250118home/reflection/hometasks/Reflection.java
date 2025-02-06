package my20250118home.reflection.hometasks;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //        3. Имеется класс lesson20241119.hometasks.Jokes. Через рефлексию заменить список исходных шуток в классе.
        Class<Jokes> jokesClass = Jokes.class;
        Method[] declaredMethods = jokesClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(method -> System.out.println(method.getName()));

        Constructor<Jokes> constructor = jokesClass.getConstructor();
        Jokes jokes = constructor.newInstance();
        Field[] declaredFields = jokesClass.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(field -> System.out.println(field.getName()));
        Field jokeList = jokesClass.getDeclaredField("jokeList");
        ArrayList<String> list = new ArrayList<>();
        list.add("New Jokes 1");
        list.add("New Jokes 2");
        list.add("New Jokes 3");
        list.add("New Jokes 4");

        jokeList.setAccessible(true);
        jokeList.set(jokes, list);

        System.out.println(jokes.getJokeList());

    }
}
