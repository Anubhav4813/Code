package Abstraction;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayHello();

        Animal dog2 = new Dog();
        dog2.sayHello();

        Animal cat = new Cat();
        cat.sayHello();

        // Animal animal = new Animal(); // This will not be created
    }
}
