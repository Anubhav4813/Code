package Abstraction;

public abstract class Animal {

    private String name;
    private int age;
    private boolean hasSuperpowers;

    public Animal() {
        this.hasSuperpowers = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void sayHello();

    public void sleep() {
        System.out.println("Zzz");
    }
}

