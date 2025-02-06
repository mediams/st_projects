package _projects2025_01.my20250118home.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person person = new Person("Андрей");
        person.sayHello();


        Class<Person> personClass = Person.class;
        Person person1 = personClass.getConstructor(String.class).newInstance("Igor");
        Method method = person1.getClass().getDeclaredMethod("sayHello");
        method.invoke(person1);
    }
}

