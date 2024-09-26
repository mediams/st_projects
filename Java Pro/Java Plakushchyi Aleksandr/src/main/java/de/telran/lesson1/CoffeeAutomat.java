package de.telran.lesson1;

public class CoffeeAutomat {
    private String name;
    private String[] typesCoffee;
    private int countWater;

    public CoffeeAutomat(String name, String[] typesCoffee) {
        this.name = name;
        this.typesCoffee = typesCoffee;
    }

    public String[] getTypesCoffee() {
        return typesCoffee;
    }

    public String getName() {
        return name;
    }

    // меняем воду
    public void setCountWater(int countWater) {
        this.countWater = countWater;
    }

    // поведение
    public String getCoffee(int numberCoffee) {
        if(countWater <= 0) { //есть вода
            return "Нет воды";
        }

        if(numberCoffee >= 0 && numberCoffee < typesCoffee.length) {
            return typesCoffee[numberCoffee];
        }
        else {
            return "Такой напиток сварить не могу!";
        }
    }


}
