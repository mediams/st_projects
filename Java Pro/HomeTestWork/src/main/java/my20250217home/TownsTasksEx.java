package my20250217home;

import java.util.LinkedList;

record Town(String name, int distance) {
    @Override
    public String toString() {
        return String.format("\n%s (%d)", name, distance);
    }

}

public class TownsTasksEx {
    private static LinkedList<Town> towns = new LinkedList<>();

    public static void main(String[] args) {
        addPlace(new Town("Kiyv", 800));
        addPlace(new Town("Avdiivka", 0));
        addPlace(new Town("Yasinuvata", 12));
        addPlace(new Town("Donetsk", 15));
        addPlace(new Town("Lviv", 1200));
        addPlace(new Town("Vinnica", 600));

        System.out.println(towns);
    }

    private static void addPlace(Town town) {
        int indexMatcher = 0;
        for (Town city : towns) {
            if (city.distance() > town.distance()) {
                towns.add(indexMatcher, town);
                return;
            }
            indexMatcher++;
        }
        towns.add(town);

//        int index = Collections.binarySearch(list, town, Comparator.comparingInt(Town::distance));
//        if (index < 0) {
//            index = -(index + 1); // Получаем правильную позицию для вставки
//        }
//        list.add(index, town);
//        Этот метод работает за O(log N) благодаря бинарному поиску, в отличие от линейного поиска O(N) в обоих ваших методах.
    }
}
