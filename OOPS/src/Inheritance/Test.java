package Inheritance;

public class Test {
    public static void main(String[] args) {
        Child child = new Child("Anubhav", 23);
        System.out.println(child.getName());
        System.out.println(child.getAge());
        System.out.println(child.hasSuperPower());

        child.childMethod();
    }
}
