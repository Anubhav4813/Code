package RTPolymorphism;

public class Test {
    public static void main(String[] args) {

        // Method Overloading
        Animal myAnimal = new Animal();
        myAnimal.sayHello();

        Animal cat = new Cat();
        cat.sayHello();

        Animal dog = new Dog();
        dog.sayHello();
    }
}
