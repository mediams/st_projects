package my20250118home.reflection.tasks;

import _projects2024_10.my20241002.inheritance.Animal;
import _projects2024_10.my20241002.inheritance.Dog;
import my20250118home.reflection.tasks.inheritance.Human;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, ClassNotFoundException {
//        2. Имеется класc lesson20240924.inheritance.Human. Через рефлексию
//        - вызвать методы introduce(), feedAnimal(Animal animal)
//        -создать экземпляр класса


        Class<Human> humanClass = Human.class;
        Constructor<?>[] constructors = humanClass.getConstructors();
        Arrays.stream(constructors).forEach(constructor -> {
            System.out.println(constructor.getName());
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Arrays.stream(parameterTypes).forEach(aClass -> {
                System.out.println(aClass.getSimpleName());
            });
        });
        Human person = humanClass.getConstructor(String.class).newInstance("Person");
        Method[] declaredMethods = humanClass.getDeclaredMethods();
        Arrays.stream(declaredMethods)
                .forEach(method -> System.out.println(method.getName()));
        Method methodIntroduce = humanClass.getDeclaredMethod("introduce");
        methodIntroduce.invoke(person);

        // Создаём объект Dog
        Class<Dog> dogClass = Dog.class;
        Dog dog = dogClass.getConstructor(String.class, int.class).newInstance("Dog", 2);

        // Получаем правильный Animal.class
        Class<?> animalClass = Class.forName("_projects2024_10.my20241002.inheritance.Animal");

        // Находим метод feedAnimal с правильным параметром
        Method methodFeedAnimal = humanClass.getDeclaredMethod("feedAnimal", animalClass);

        // Вызываем метод
        methodFeedAnimal.invoke(person, dog);

    }
}
