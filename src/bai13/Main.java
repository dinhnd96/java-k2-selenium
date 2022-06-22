package bai13;

interface Animal{
    public void animalSound();
    public void sleep();
};
interface Bird{
    public void action();
}
class Pig implements Animal,Bird{
    @Override
    public void animalSound() {
        System.out.println("THE PIG say wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzz");
    }

    @Override
    public void action() {
        System.out.println("Flying");
    }
};
public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        myPig.action();
    }
}
