package bai02;

import java.util.Scanner;

public class SwitchCasesStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        String inputDay = scanner.next() ;
        String myName = "Dinh" ;

        if( inputDay.equals("Monday") || inputDay.equals("Tuesday") ||inputDay.equals("Wednesday") ||inputDay.equals("Thursday") ||inputDay.equals("Friday")) {
            System.out.println("weeksday");
            System.out.println(inputDay.length());
            System.out.println(inputDay.toUpperCase());
            System.out.println(myName.indexOf('h'));

        } else if (inputDay.equals("Saturday") || inputDay.equals("sunday")){
            System.out.println("weekend day");

        } else {
            System.out.println("wrong input");

        }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
//        switch (inputDay) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                System.out.println("weeksday");
//                break;
//            case "Saturday" :
//            case "sunday" :
//                System.out.println("weekend day");
//                break;
//            default:
//                System.out.println("wrong input");
//        }
//        switch (inputNumber){
//            case 1:
//                System.out.println("Giai nhat");
//                System.out.println("Horaay");
//                break;
//            case 2:
//                System.out.println("Giai nhi");
//                break;
//            case 3:
//                System.out.println("Giai ba");
//                break;
//            default:
//                System.out.println("Chuc ban may man lan sau");
//        }
//        System.out.println("Out of switch statement");

    }
}
