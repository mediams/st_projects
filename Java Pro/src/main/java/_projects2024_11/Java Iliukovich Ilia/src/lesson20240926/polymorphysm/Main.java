package lesson20240926.polymorphysm;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Integer i;
        i = 10;

        Parent link;

        boolean condition = false;
        if (condition) {
            link = new Parent();
        } else {
            link = new Child();
        }
        link.method();

//
//        Object object = "string";
//        object = 123;
//        object = new Child();
//
//        Child child = (Child) object; // class cast -- unsave
////        object.method();
//        child.method();
//
//        Parent parent = (Parent) child; // class cast -- save
//        Object object2 = parent;
    }
}
