package my20241121class;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Tasks {
    public static void main(String[] args) {
//        1. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
        IntStream intStream = IntStream.rangeClosed(1, 1000);
        System.out.println(IntStream.rangeClosed(1, 100).filter(value -> value % 7 == 0).count());

//        2. Посчитать сумму квадратов чисел от 1 до 100
        IntStream intSumOfSquere = IntStream.rangeClosed(1, 100);
        System.out.println(intSumOfSquere.reduce((acc, y) -> acc + (y * y)).getAsInt());


//        3. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound".
//                С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.
        List<String> stringList = List.of("Specific", "Measurable", "Achievable", "Relevant", "Time-bound");
        System.out.println(stringList.stream()
                .map(s -> s.substring(0, 1))
                .reduce((s1, s2) -> s1 + "." + s2).get() + ".");

//        4. Переписать через стримы фрагменты кода:
        String[] strings = new String[]{"Test", "One", "Two"};
//        for (String s : strings) {
//            System.out.println(s);
//        }
        Arrays.stream(strings).forEach(System.out::println);


//        public static void feed(List<Cat> catList) {
//            for (int i = 0; i < catList.size(); i++) {
//                if (catList.get(i).isHungry()) {
//                    catList.get(i).setHungry(false);
//                }
//            }
//        }

    }
    //        4. Переписать через стримы фрагменты кода:
//        public static List<String> method(List<String> strings) {
//            List<String> result = new ArrayList<>();
//            for (String s : strings) {
//                if (!result.contains(s)) {
//                    result.add(s);
//                }
//            }
//            return result;
//        }
    public static List<String> method(List<String> strings) {
        return strings.stream()
                .distinct()
                .toList();
    }
//    --------------------------------------------
}
