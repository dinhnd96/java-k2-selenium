package bai9;

public class Main {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tutututu , Tutu!!");
    }
}
class Car extends Main {
    private String modelName = "Mustang!";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + "" + myCar.modelName);
    }
}