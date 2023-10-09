public class Vehicle {
    private int engineCapacity;
    private String make;

    // Constructor
    public Vehicle(int engineCapacity, String make) {
        this.engineCapacity = engineCapacity;
        this.make = make;
    }

    // Getter for engineCapacity
    public int getEngineCapacity() {
        return engineCapacity;
    }

    // Setter for engineCapacity
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
        System.out.println("Changing vehicle engine capacity: new capacity = " + engineCapacity);
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // toString method
    @Override
    public String toString() {
        return "Vehicle Info:\n  engine capacity = " + engineCapacity + "cc\n  make = " + make;
    }
}
