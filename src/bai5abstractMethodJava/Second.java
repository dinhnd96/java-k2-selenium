package bai5abstractMethodJava;

public class Second {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name :" + myObj.fname);
        System.out.println("Email :" +myObj.email);
        System.out.println("Age :" +myObj.age);
        System.out.println("Graduation year : " + myObj.graduationYear);
        myObj.Study();
    }
}
