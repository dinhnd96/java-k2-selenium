package bai03;

public class JavaMethodOverloading {
   static int plusMethod(int x , int y){
       return x + y;
   }
   static double plusMethod(double x , double y) {
       return x + y;
   }

    public static void main(String[] args) {
        int myNum = plusMethod(8, 5);
        double myNum1 = plusMethod(4.3, 6.26);
        System.out.println("int: "  + myNum);
        System.out.println("double: "  + myNum1);
    }
}
