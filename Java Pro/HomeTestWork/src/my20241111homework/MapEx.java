package my20241111homework;

import java.util.*;

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

//        Получить Map страна / суммарный накопленный бонус покупателей из данной страны
        Map<String, Integer> getCountrySumOfBonus = new HashMap<>();
        for (Customer customer : list) {
            getCountrySumOfBonus.put(customer.getCountry(), getCountrySumOfBonus.getOrDefault(customer.getCountry(), 0) + 1);
        }
        System.out.println(getCountrySumOfBonus);

//        2. Имеется некоторый текст. Составить словарь используемых в нем слов с частотой их употребления.
//        Отсортировать словарь по частоте встречаемости слов (по убыванию).

        String text = "The method that is currently being executed by a thread" +
                "is the thread’s current method. The stack frame for the" +
                "current method is the current frame. The class in which" +
                "the current method is defined is called the current class, and" +
                "the current class’s constant pool is the current constant pool." +
                "As it executes a method, the JVM keeps track of the current" +
                "class and current constant pool. When the JVM encounters" +
                "instructions that operate on data stored in the stack frame," +
                "it performs those operations on the current frame.";

        String[] stringArray = text.toLowerCase().replaceAll("[^a-zA-Z ]", "").split(" ");

        Map<String, Integer> vocabulary = new HashMap<>();
        for (String s : stringArray) {
            vocabulary.put(s, vocabulary.getOrDefault(s, 0) + 1);
        }

        System.out.println(vocabulary);
        List<Map.Entry<String, Integer>> listMap = new ArrayList<>(vocabulary.entrySet());

        listMap.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : listMap) {
            System.out.print(entry.getKey() + ": " + "(" + entry.getValue() + "); ");
        }

        System.out.println(vocabulary);


    }
}
