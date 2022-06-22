package bai14;

enum Level{
    Low,
    Medium,
        Hight
}

public class Main {
    public static void main(String[] args) {
        Level myVar = Level.Medium;
        System.out.println(myVar);
        for (Level myVar1 : Level.values()){
            System.out.println(myVar1);
        }
    }
}
