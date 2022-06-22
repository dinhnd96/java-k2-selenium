package bai02;

public class ArrayType {
    public static void main(String[] args) {

        int[] myIntArr = new int[3];

        myIntArr[0] = 1;
        myIntArr[1] = 2;
        myIntArr[2] = 3;
        for (int i = 0 ; i < myIntArr.length; i++){
            myIntArr[i] = myIntArr[i] *2;
        }

        for(int elementIndex = 0; elementIndex < myIntArr.length; elementIndex++){
            System.out.println(myIntArr[elementIndex]);
        }
    }
}
