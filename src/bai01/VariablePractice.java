package bai01;

import java.util.Scanner;

public class VariablePractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Plase enter your number : ");

        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.printf("Number %d is even number", inputNumber);
        } else {
            System.out.printf("Number %d is odd number", inputNumber);
        }
        System.out.printf("Tong của %d voi %d is %d", 1, 2, 3);

        int a = 3;
        int b = 4;
        boolean isABiggerThanB = a > b;

    }


}
