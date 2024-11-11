package my20241111homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        List<Customer> list = List.of(
                new Customer("Rob", "rob@mail.com", "Spain", 2, false),
                new Customer("John", "john@mail.com", "USA", 2, true),
                new Customer("Rokki", "Rokki@mail.com", "Italy", 1, false),
                new Customer("Lilu", "lilu@mail.com", "USA", 2, true),
                new Customer("Max", "Max@mail.com", "UK", 5, true),
                new Customer("Steve", "Steve@mail.com", "Spain", 2, false),
                new Customer("Leon", "Leon@mail.com", "France", 3, true)
        );

//        Получить Map email / страна

        Map<String, String> getEmailCountry = new HashMap<>();
        for (Customer customer : list) {
            getEmailCountry.put(customer.getEmail(), customer.getCountry());
        }
        System.out.println(getEmailCountry);

//        Получить Map email / покупатель
        Map<String, String> getEmailEmployees = new HashMap<>();
        for (Customer customer : list) {
            getEmailEmployees.put(customer.getEmail(), customer.getName());
        }
        System.out.println(getEmailEmployees);

//        Получить Map isEmailConfirmed / количество подтвержденных и неподтвержденных email

        Map<String, Integer> countEmail = new HashMap<>();
        countEmail.put("количество подтвержденных email", 0);
        countEmail.put("количество неподтвержденных email", 0);
        for (Customer customer : list) {
            if (customer.isEmailConfirmed()) {
                countEmail.put("количество подтвержденных email", countEmail.get("количество подтвержденных email") + 1);
            } else {
                countEmail.put("количество неподтвержденных email", countEmail.get("количество неподтвержденных email") + 1);
            }
        }
        System.out.println(countEmail);

//        Получить Map> страна / список покупателей из данной страны
        Map<String, List<String>> getCountryEmployeass = new HashMap<>();
        for (Customer customer : list) {
            List<String> customers = getCountryEmployeass.getOrDefault(customer.getCountry(), new ArrayList<>());
            customers.add(customer.getName());
            getCountryEmployeass.put(customer.getCountry(), customers);
        }
        System.out.println(getCountryEmployeass);
    }
}
