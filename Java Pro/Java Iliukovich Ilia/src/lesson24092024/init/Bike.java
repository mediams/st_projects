package lesson24092024.init;

public class Bike {
    //    Создайте класс Bike, где будет статическое поле bikeCount, которое увеличивается каждый раз при создании нового объекта Bike.
//    Добавьте статический метод, который выводит количество созданных велосипедов, и убедитесь, что этот метод работает правильно.
    private static int bikeCount = 0;

    public Bike(String name) {
        bikeCount++;
    }

    public static void printCount() {
        System.out.println("bikeCount = " + bikeCount);
    }
}
