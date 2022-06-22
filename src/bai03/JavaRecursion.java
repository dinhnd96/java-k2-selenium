package bai03;

public class JavaRecursion {
    public static void main(String[] args) {
        countDown(3);
//        int result = sum(10);
//        System.out.println(result);
    }
    public static int countDown(int k) {
        if(k > 0) {
            System.out.println(k);
            return countDown(k-1);
        } return k ;
    }
//    public static int sum(int k) {
//        if(k >0) {
//            System.out.println(k);
//            return k + sum(k -1 );
//        } else {
//            return 0;
//        }
//    }
}
