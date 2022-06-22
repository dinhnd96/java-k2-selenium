package bai15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter user Name");

        String userName = myObj.nextLine();
        System.out.println("Enter user Age");

        int Age = myObj.nextInt();
        System.out.println("Enter user salary");
        double salary = myObj.nextDouble();
        System.out.println("User name is" + userName);
        System.out.println("Age is" + Age);
        System.out.println("Salary is" + salary);
    }

}
