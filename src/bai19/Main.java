package bai19;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Ha Noi", "Ha Nam");
        capitalCities.put("Ha Noi1", "Ha Nam1");
        capitalCities.put("Ha Noi2", "Ha Nam2");
        capitalCities.put("Ha Noi3", "Ha Nam3");
        capitalCities.get("Ha Noi");
        capitalCities.remove("Ha Noi");
//        capitalCities.clear();
        System.out.println(capitalCities);

    }
}
