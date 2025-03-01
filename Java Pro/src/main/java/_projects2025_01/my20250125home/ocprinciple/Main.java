package my20250125home.ocprinciple;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DiscountService RegularService = new DiscountService(new RegularDiscount());
        DiscountService VipService = new DiscountService(new VIPDiscount());
        DiscountService SuperService = new DiscountService(new SuperVIP());

        System.out.println("Regular: " + RegularService.calculateDiscount("Regular", 100));
        System.out.println("VIP: " + VipService.calculateDiscount("VIP", 100));
        System.out.println("SuperVIP: " + SuperService.calculateDiscount("SuperVIP", 100));

        Map<String, String> stringMap = new HashMap<>();
//        stringMap.getOrDefault()
    }
}
