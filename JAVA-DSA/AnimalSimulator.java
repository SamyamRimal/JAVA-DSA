// Base class
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to make sound
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    // Method to describe the animal
    public void describe() {
        System.out.println("I am an animal named " + name);
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Main class
public class AnimalSimulator {
    public static void main(String[] args) {
        // Create Animal objects
        Animal genericAnimal = new Animal("Generic");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Demonstrate polymorphism
        Animal[] animals = {genericAnimal, dog, cat};
        for (Animal animal : animals) {
            animal.describe();
            animal.makeSound();
            System.out.println(); // For spacing
        }
    }
}
