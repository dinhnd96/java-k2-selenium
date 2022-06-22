package bai10;

public class Animal {
    public void animalSound(){
        System.out.println("This is animal sound");
    }
}
class Pig extends Animal {

    public void animalSound() {
        System.out.println("This is Pig sound");
    }
}
class Dog extends Animal {

    public void animalSound() {
        System.out.println("This is Dog sound");
    }
}
class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myPig = new Pig();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
