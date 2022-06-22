package bai17;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>();
        car.add("DinhDinhDinh");        car.add("Tuan Beo1111");
        car.add("Tuan Beo1111");
        car.add("Tuan Be111o");

        car.add("Minh AnhMinh Anh");

//        for (int i = 0 ; i < car.size(); i++) {
//            System.out.println(car.get(i));
//        }

//        for (String i : car) {
//            System.out.println(i);
//        }
        Collections.sort(car);
        for (String i : car) {
            System.out.println(i);
        }
    }
}
