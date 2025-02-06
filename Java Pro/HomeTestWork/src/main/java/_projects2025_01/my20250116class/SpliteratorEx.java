package my20250116class;

import java.util.List;
import java.util.Spliterator;

public class SpliteratorEx {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6);
        var listIterator = list.iterator();
        var spliterator = list.spliterator();

        System.out.println(spliterator.tryAdvance(integer -> System.out.println(integer)));
        while (spliterator.tryAdvance(element -> System.out.println(element))) {

        }
        System.out.println(listIterator.next());
        System.out.println(spliterator.tryAdvance(integer -> System.out.println(integer)));

        spliterator = list.spliterator();
        Spliterator<Integer> spliterator2 = spliterator.trySplit();
        Spliterator<Integer> spliterator3 = spliterator2.trySplit();

        System.out.println("First spliterator");
        while (spliterator.tryAdvance(element -> {
            System.out.println(element);
        })) ;

        System.out.println("Second spliterator");
        while (spliterator2.tryAdvance(element -> {
            System.out.println(element);
        }));


        System.out.println("Third spliterator");
        while (spliterator3.tryAdvance(element -> {
                    System.out.println(element);
                }
        ));
    }
}
