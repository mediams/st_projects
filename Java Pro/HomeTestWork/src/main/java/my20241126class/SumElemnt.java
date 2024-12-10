package my20241126class;

import java.util.stream.DoubleStream;

public class SumElemnt {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 0; i < 10_000; i++) {
            sum += 0.1;
        }
        System.out.println(sum);

        System.out.println(DoubleStream.generate(() -> 0.1).limit(10_000).sum());
    }
}
