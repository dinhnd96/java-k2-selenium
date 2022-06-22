package bai12;

abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("zzzz!!");
    }
}
class Pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println("The pig say : Weee WEee ");
    }
}

public class Main {
    public static void main(String[] args) {
       Pig myPig = new Pig();
       myPig.animalSound();
       myPig.sleep();
    }

}
