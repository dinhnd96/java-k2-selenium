package bai5abstractMethodJava;

abstract class Main {
    String fname = "Dinh";
    String email = "dinhnd96@gmail.co";
    int age = 25;
    public abstract void Study();
}
class Student extends Main{
    public int graduationYear = 2018;
    @Override
    public void Study() {
        System.out.println("study all day long");
    }
}
