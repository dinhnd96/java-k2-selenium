package bai18;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Dinh");
        cars.add("Minh Anh");
        cars.add("Minh Anh 2");
        cars.add("Dinh 2");
        cars.addFirst("Minh Anh1");
        System.out.println(cars);

    }
}
