package bai02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter yout age : ");
        int userAge = scanner.nextInt();


        if (userAge < 18) {
            System.out.println("Khong ban");
        } else if (userAge <= 55) {
            System.out.println("OK");

        } else {
            System.out.println("2!!!");

        }
        System.out.println("See you again");
    }


}
