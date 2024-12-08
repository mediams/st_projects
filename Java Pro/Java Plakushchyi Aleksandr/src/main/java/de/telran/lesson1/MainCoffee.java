package de.telran.lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainCoffee {
    public static void main(String[] args) {

        String[] coffes = {"Americano", "Latte", "Capuchino"};
        CoffeeAutomat automat = new CoffeeAutomat("Siemens", coffes);
        System.out.println(automat.getName());
        System.out.println(Arrays.toString(automat.getTypesCoffee()));

        // Залить воду
        automat.setCountWater(10);
        // Варим кофе
        System.out.println("Получите -> "+automat.getCoffee(1));


        String[] coffes2 = {"Americano", "Espresso"};
        CoffeeAutomat automat2 = new CoffeeAutomat("New", coffes2);
        // Залить воду
        automat2.setCountWater(5);
        // Варим кофе
        System.out.println("Получите -> "+automat2.getCoffee(1));

    }
    //test
}
