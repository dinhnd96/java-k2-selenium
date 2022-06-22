package bai02;

import java.util.Scanner;

public class ForExercies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        for (int currentNumber = inputNumber; currentNumber > 0; currentNumber--) {

            for (int i = 1; i <= currentNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
