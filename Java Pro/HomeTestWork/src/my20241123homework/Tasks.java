package my20241123homework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Tasks {
    public static void main(String[] args) {
//        1. Переписать через стримы фрагменты кода:
//        a)
//        List<Double> doubles = new ArrayList<>();
//        for (Double d : doubleList) {
//            if (d % 2 == 1) {
//                doubles.add(d);
//            }
//        }
//        System.out.println(doubles);

        List<Double> doubles = doubleList.stream().filter(d -> d % 2 == 1).collect(Collectors.toList());


//
//        b)
//        String word = null;
//        for (String t : list){
//            if (t.length() == 3) {
//                word = t;
//                break;
//            }
//        }
//        System.out.println(word);

        word = list.stream().filter(s -> s.length() == 3).findFirst().orElse(null);

//
//        c)
//        public static int getSum(List<Integer> integers) {
//            int oddSum = 0;
//            for(Integer i: integers) {
//                if(i % 2 != 0) {
//                    oddSum += i;
//                }
//            }
//            return oddSum;
//        }


        integers.stream().filter(integer -> integer % 2 != 0).reduce(0, Integer::sum));

//
//        d)
//        public static int findIndex(String[] data, String element) {
//            for (int i = 0; i < data.length; i++) {
//                if (data[i].equals(element)) {
//                    return i;
//                }
//            }
//            return -1;
//        }

        return IntStream.range(0, data.length).filter(i->data[i].equals(element)).findFirst().orElse(-1);

//
//        e)
//        double sum = 0.0;
//        for (int i = 0; i < 10_000; i++) {
//            sum += 0.1;
//        }

        System.out.println(DoubleStream.generate(() -> 0.1).limit(10_000).sum());

//
//        f)
//        public static void fill(List<Integer> list, int capacity) {
//            for (int i = 0; i < capacity; i++) {
//                list.add(i);
//            }
//        }

        IntStream.range(0, capacity).forEach(list::add);


//
//        g)
//        Set<String> names = Set.of("Ivan", "Peter", "William", "Mary");
//        Set<Integer> integerSet = new TreeSet<>();
//        for (String s : names) {
//            integerSet.add(s.length());
//        }
//        System.out.println(integerSet);

        names.stream().forEach(s -> integerSet.add(s.length()));

//
//        h)
//        public static Map<Boolean, List<Integer>> getMap () {
//            Map<Boolean, List<Integer>> map = new TreeMap<>();
//            for (int i = 0; i < 100; i++) {
//                if (i % 3 == 0) {
//                    if (map.containsKey(true)) {
//                        map.get(true).add(i);
//                    } else {
//                        map.put(true, new ArrayList<>());
//                        map.get(true).add(i);
//                    }
//                } else {
//                    if (map.containsKey(false)) {
//                        map.get(false).add(i);
//                    } else {
//                        map.put(false, new ArrayList<>());
//                        map.get(false).add(i);
//                    }
//                }
//            }
//            map = IntStream.range(0, 99).filter(i -> i % 3 == 0).
//            return map;
//        }

       IntStream.range(0, 100).mapToObj(value -> value).collect(Collectors.partitioningBy(i -> i % 3 == 0));

//
//        2. С помощью IntStream и метода flatmap() получить все тройки пифагоровых чисел менее 1000.
//        (Пифагорова тройка - упорядоченный набор из трёх натуральных чисел (a, b, c),
//                удовлетворяющих уравнению a^2 + b^2 = c^2. Например, [3, 4, 5], [6, 8, 10]).

//    }
//}
