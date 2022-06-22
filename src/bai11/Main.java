package bai11;

class OuterClass {
    int x = 10;
   public class InnerClass{
       public int myInnerMethod(){
         return x;
       };

    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass MyInner = myOuter.new InnerClass();
        System.out.println(MyInner.myInnerMethod());
    }
}
