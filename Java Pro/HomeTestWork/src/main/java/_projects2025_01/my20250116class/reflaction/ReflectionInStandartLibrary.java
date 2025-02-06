package my20250116class.reflaction;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class ReflectionInStandartLibrary {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        var arrayList = new ArrayList<>();
        arrayList.add("A");

        Class<? extends ArrayList> arrayListClass = arrayList.getClass();
        Field field = arrayListClass.getDeclaredField( "elementData");
        field.setAccessible(true);
        Object[] innnerArray = (Object[]) field.get(arrayList);
        System.out.println(Arrays.toString(innnerArray));

    }
}
