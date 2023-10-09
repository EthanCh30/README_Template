public class HoldenDB extends VehicleDB {

    // Constructor with no formal parameters that calls the parent's constructor with a parameter of 20
    public HoldenDB() {
        super(20);
    }

    // Method to add a Car
    public void addCar(int engineCapacity, String type, String model) {
        Car holdenCar = new Car(engineCapacity, "Holden", type, model);
        addVehicle(holdenCar);
    }

    // Overridden print method
    @Override
    public void print() {
        System.out.println("=== Holdens Only ===");
        super.print();
    }
}
