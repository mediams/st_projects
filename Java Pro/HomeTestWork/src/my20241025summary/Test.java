package my20241025summary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<Integer> listArray = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        int m = 1000;
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            listArray.add(random.nextInt());
        }
    }
}
