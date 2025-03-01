package _projects2025_01.my20250117home;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Test {
        public int value;
    }

public class TestEx {

        public static void main(String[] args) throws Exception {
            Field field = Test.class.getDeclaredField("value");
            int modifiers = field.getModifiers();
            System.out.println(modifiers);
            System.out.println("Приватное поле: " + Modifier.isPrivate(modifiers));
        }
    }
