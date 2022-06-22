package bai02;

public class ForLoop {
    static void myMethod(String fname , int age) {
        System.out.println(fname + " is " + age);
    };
    public static void main(String[] args) {

    int myAge = 10;
    boolean isTrue = true ;
    float f = 1.1223F ;
    double d = 2.123 ;
    char c ;
    c = 'c' ;
    String myName = "dinh" ;
    myAge = 18;

        System.out.println(myAge);
        System.out.println(isTrue);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.printf("My name is %s and %d age.%n" , myName , myAge);
        System.out.println("my name is " + myName  + " and age is " + myAge);
//        int retry = 0 ;
//        for (; retry < 10 ; retry++){
//            System.out.println("Try :" + (retry + 1) );
//        }
//        if( retry == 10 ){
//            System.out.println("Clear data ");
//        }
//        int currentNumber = 0 ;
//        for (;  currentNumber < 10; currentNumber++) {
//            System.out.println(currentNumber);
//        }
//        System.out.println(currentNumber);
//        System.out.println("out of loop");
        myMethod("liam" , 16);
        myMethod("Trang" , 17);
        myMethod("Troll" , 20);
    }


}
