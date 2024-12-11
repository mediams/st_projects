package _projects2024_10.my20241025summary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CompareExamples {
    public static void main(String[] args) {
        System.out.println("string1".equals("string1"));
        System.out.println(Objects.equals("string1", "string1"));
        int a = 10;
        int b = 11;

        System.out.println(a <= b);

        Integer i1 = 10;
        Integer i2 = 20;
        System.out.println(i2 + i1);
        System.out.println(i1 < i2); //unboxing

        System.out.println(i1.compareTo(i2));
        System.out.println(i2.compareTo(i1));
        System.out.println(i1.compareTo(i1));

        char c1 = 'a';
        char c2 = 'b';
        char c3 = 'A';

        System.out.println(c1 > c2);
        System.out.println(c1 > c3);
        Character c4 = 'a';
        Character c5 = 'A';
        System.out.println(c4.compareTo(c5));
        System.out.println("-");

        boolean b1 = true;
        boolean b2 = false;
//        System.out.println(b2 > true); nicht möglich
        Boolean b3 = true;
        Boolean b4 = false;
        System.out.println(b3.compareTo(b4));

        System.out.println("str1".compareTo("str2"));
        System.out.println("str1".length() < "str2".length());

        System.out.println("abc".compareTo("abd"));
        System.out.println("abc".compareTo("abcd"));
        System.out.println("abcy".compareTo("abcd"));
        System.out.println("cat".compareTo("Cat"));
        System.out.println("Cat".toLowerCase().compareTo("cat"));

        List<String> list = new ArrayList<>(List.of("hello", "world", "hi", "bye","text","bya"));
        Collections.sort(list);
        System.out.println(list);



    }
}
