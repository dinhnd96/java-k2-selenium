package bai17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(100);
        myNumbers.add(20);
        myNumbers.add(30);
        myNumbers.add(401);
        myNumbers.add(50);
        myNumbers.add(60);
        myNumbers.add(70);
        Collections.sort(myNumbers);

        for (int i : myNumbers){
            System.out.println(i);
        }
    }
}
