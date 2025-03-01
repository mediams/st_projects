package _projects2024_10.my20241022class;

public class CatHause {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Cat cat2 = new Cat("Cat2");
        Cat.Kitten kitten1 = cat.new Kitten("Kitten");
        Cat.Kitten kitten2 = cat.new Kitten("Kitten2");

        cat.setKitten(kitten2);
        System.out.println(cat);
        System.out.println(kitten1);


//        for(Cat.Kitten kitten : cat){
//            System.out.println(kitten);
//        }

    }
}
