package my20250118homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionEx {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<MyStack> myStackClass = MyStack.class;
        Method[] declaredMethods = myStackClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(method -> {
            System.out.println(method.getName() + ", private: " + Modifier.isPrivate(Modifier.fieldModifiers()));
        });
        MyStack myStack = myStackClass.getConstructor(int.class).newInstance(1);
        Method methodPush = myStackClass.getDeclaredMethod("push", String.class);
        methodPush.setAccessible(true);
        methodPush.invoke(myStack, "Test string");
        System.out.println(myStack);

    }
}
//Имеется класс summary20241108.MyStack (см. код в репозитории). Через рефлексию:
//вызвать методы push() и pop() на существующем объекте,
//создать экземпляр класса,
//добавить шестой элемент "F" в уже заполненный стек из пяти элементов:
//MyStack stack = new MyStack(5);
//stack.push("A");
//stack.push("B");
//stack.push("C");
//stack.push("D");
//stack.push("E");
