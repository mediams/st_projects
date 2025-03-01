package _projects2024_11.my20241105class;

public class HahCodeClassExamples {
    public static void main(String[] args) {
        Integer num = 10;

        System.out.println(num.hashCode());

        Character c = 'a';
        Character b = 'b';
        System.out.println(c.hashCode());
        System.out.println(b.hashCode());

        String s = "Name";
        String s2 = "Nama";
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("0".hashCode());
        System.out.println("1".hashCode());


    }
}
