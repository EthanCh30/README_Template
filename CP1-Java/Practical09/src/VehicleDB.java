public class VehicleDB {
    private Vehicle[] vehicles;
    private int numV;

    public VehicleDB() {
        this.vehicles = new Vehicle[5];
        this.numV = 0;
    }
    public VehicleDB(int initialSize) {
        this.vehicles = new Vehicle[initialSize];
        this.numV = 0;
    }
    // Method to add a Vehicle
    public void addVehicle(Vehicle vehicle) {
        if (numV == vehicles.length) {
            increaseSize();
        }
        vehicles[numV++] = vehicle;
    }

    // Method to increase the size of the database by 10
    private void increaseSize() {
        Vehicle[] newVehicles = new Vehicle[vehicles.length + 10];
        for (int i = 0; i < vehicles.length; i++) {
            newVehicles[i] = vehicles[i];
        }
        vehicles = newVehicles;
    }

    // Method to print all the Vehicles in the database
    public void print() {
        System.out.println("=== Vehicle Data Base ===");
        for (int i = 0; i < numV; i++) {
            System.out.println(vehicles[i].toString());
        }
    }

    // Getter for the size of the database
    public int getDatabaseSize() {
        return vehicles.length;
    }

    public int getSize() {
        return getDatabaseSize();
    }


    // Getter for the number of vehicles in the database
    public int getNumberOfVehicles() {
        return numV;
    }

    public int getNumV() {
        return numV;
    }
}
