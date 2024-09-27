package summary20240927.equals;

import java.util.Objects;

public class CompareForStringAndInteger {

    public static void main(String[] args) {
        String s1 = "string";
        String s2 = "string";
        String s3 = new String("string");

        // string pool
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        s3 = s3.intern();
        System.out.println(s1 == s3);
//
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(Objects.equals(s1, s2));

        Integer i1 = 1;
        Integer i2 = 1;
        Integer i3 = 128;
        Integer i4 = 128;

        // -128 ---- 127 are in integer pool
        System.out.println(i1 == i2); // true
        System.out.println(i3 == i4); // false

        System.out.println(i1.equals(i2)); // true
        System.out.println(i3.equals(i4)); // true
    }


}
