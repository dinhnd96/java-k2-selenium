package bai20;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Dinh");
        cars.add("Dinh1");
        cars.add("Dinh2");
        cars.add("Dinh3");
        System.out.println(cars);
        System.out.println(cars.size());
        for (String i : cars) {
            if (cars.contains("Dinh30")) {
                System.out.println("He is dinh");
            } else {
                System.out.println("He is clone");
            };
        }
    }
}
