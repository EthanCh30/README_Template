public class Vehicle {
    private String make;
    private String color;
    private int wheels;

    public Vehicle(String make) {
        this.make = make;
        this.color = "Unknown";
        this.wheels = 4;
        System.out.println("Vehicle object created.");
    }

    public Vehicle(String make, String color) {
        this.make = make;
        this.color = color;
        this.wheels = 4;
        System.out.println("Vehicle object created.");
    }

    public Vehicle(String make, String color, int wheels) {
        this.make = make;
        this.color = color;
        this.wheels = wheels;
        System.out.println("Vehicle object created.");
    }

    public String aboutMe() {
        return "  Make: " + make + "\n  Colour: " + color + "\n  Wheels: " + wheels;
    }
}
