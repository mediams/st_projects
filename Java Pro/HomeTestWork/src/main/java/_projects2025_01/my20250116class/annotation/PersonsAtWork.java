package my20250116class.annotation;

import java.lang.reflect.Field;

public class PersonsAtWork {
    @Name(name = "Bob")
    String person1;
    @Name(name = "Tom")
    String person2;
    String person3;


    public static void main(String[] args) throws NoSuchFieldException {
        var personAtWork = new PersonsAtWork();
        System.out.println(personAtWork.person1);
        System.out.println(personAtWork.person2);
        System.out.println(personAtWork.person3);

        Class<? extends PersonsAtWork> personAtWorksClass = personAtWork.getClass();


        Name annotation = personAtWorksClass.getDeclaredField("person1").getAnnotation(Name.class);
        System.out.println(annotation.name());



    }
}

