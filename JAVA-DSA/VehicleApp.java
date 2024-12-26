// Base Class
class Vehicle {
    private String brand;
    private int wheels;

    // Constructor to initialize Vehicle
    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + wheels);
    }
}

// Derived Class
class Car extends Vehicle {
    private String fuelType;
    private boolean isAutomatic;

    // Constructor to initialize Car
    public Car(String brand, int wheels, String fuelType, boolean isAutomatic) {
        super(brand, wheels); // Call to the parent class constructor
        this.fuelType = fuelType;
        this.isAutomatic = isAutomatic;
    }

    // Method specific to Car
    public void carDetails() {
        displayDetails(); // Call the parent class method
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Automatic: " + (isAutomatic ? "Yes" : "No"));
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Tesla", 4, "Electric", true);

        System.out.println("Car Details:");
        myCar.carDetails();
    }
}
