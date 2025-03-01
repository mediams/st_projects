package my20250206class_jdbc;

import java.util.List;

public class CityService {
    public static void main(String[] args) {
        CityDAO cityDao = new CityDAO(new DBConnector());
        List<City> all = cityDao.findAll();
        all.forEach(System.out::println);
    }
}
