package org.example.a_maskify8_7;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("Skippy"));
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("64607935616"));
        System.out.println(maskify("35616"));
        System.out.println(maskify("5616"));
        System.out.println(maskify("1"));
        System.out.println(maskify(""));
    }

    public static String maskify(String str) {
        if (str.length() >= 4) {
            return "#".repeat(str.length() - 4)
                    + str.substring(str.length() - 4);
        }else return str;
    }
}
