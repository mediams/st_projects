package my20250118homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionEx {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<MyStack> myStackClass = MyStack.class;

        MyStack myStack = myStackClass.getConstructor(int.class).newInstance(5);
        Method methodPush = myStackClass.getDeclaredMethod("push", String.class);
        methodPush.setAccessible(true);
        methodPush.invoke(myStack, "Test string");
        System.out.println("Object after push(): " + myStack);
        Method methodPop = myStackClass.getDeclaredMethod("pop");
        methodPop.setAccessible(true);
        Object popped = methodPop.invoke(myStack);
        System.out.println("Object after push(): " + myStack);
        System.out.println("Popped value: " + popped);

        System.out.println("===========================");
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");
        myStack.push("E");

        Field data = myStackClass.getDeclaredField("data");
        data.setAccessible(true);

        String[] oldData = (String[]) data.get(myStack);
        String[] newData = Arrays.copyOf(oldData, oldData.length + 1);
        data.set(myStack, newData);

        methodPush.invoke(myStack, "F");
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
