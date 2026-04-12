package Encapsulation;

public class Student {
    // properties/fields/instance variables & behavior/methods

    private String name;
    private int rollNumber;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            age = 0;
        }
        this.age = age;
    }
}
