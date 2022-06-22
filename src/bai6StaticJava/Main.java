package bai6StaticJava;

public class Main {
    static void myStaticMethod(){
        System.out.println("my static method");
    };
    public void myPublicMethod(){
        System.out.println("my public method");
    }

    public static void main(String[] args) {
        myStaticMethod();

        Main myOjb = new Main();
        myOjb.myPublicMethod();
    }
}
