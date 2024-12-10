package my20241008dop;

public class CoffeeMachine {
    public static void main(String[] args) {

        int money = 20;

        CoffeeTypes coffee = CoffeeTypes.LATTE;
        System.out.println(coffee);
        System.out.println();
        displayInfo(coffee);
        System.out.println();
        makeCoffee(coffee, money);
    }

    public static void displayInfo(CoffeeTypes coffee) {
        System.out.println("Вы выбрали: " + coffee.getInfo() + ", Цена: " +coffee.getPrice());
    }

    public static void makeCoffee(CoffeeTypes coffee, int money) {
        if (money < coffee.getPrice()) {
            System.out.println("No money, no coffeey!");
            System.out.println(coffee.getInfo() + " kostet " + coffee.getPrice() + "$");
        } else if (coffee == CoffeeTypes.CAPPUCCINO) {
            System.out.println("Данного вида кофе нет. Приходите завтра, но это неточно...");
        } else {
            System.out.println("You're Geld: " + money + "$");
            System.out.println("Ваша сдача: " + (money - coffee.getPrice()) + "$");
            System.out.println(coffee.getInfo() + " hat gemacht");
        }
    }
}
