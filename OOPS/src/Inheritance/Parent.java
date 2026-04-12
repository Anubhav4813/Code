package Inheritance;

public class Parent extends Grandparent{

    public Parent(String name, int age) {
        super(name, age);
        System.out.println("Parent Constructor Called");
    }

    public void parentMethod() {
        System.out.println("Parent Method Called");
    }
}
