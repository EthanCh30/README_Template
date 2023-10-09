public class VehicleTester {

    public static void main(String[] args) {
        VehicleDB vdb = new VehicleDB();
        vdb.addVehicle(new Car(1200, "Holden", "sedan", "Barina"));
        vdb.addVehicle(new Vehicle(1500, "Mazda"));
        vdb.addVehicle(new Car(1600, "Nissan", "suv", "X-Trail"));
        vdb.addVehicle(new Vehicle(1800, "Jeep"));
        vdb.addVehicle(new Vehicle(1000, "Suzuki"));
        vdb.addVehicle(new Car(2000, "Kia", "sedan", "Cerato"));
        vdb.print();

        HoldenDB hdb = new HoldenDB();
        hdb.addCar(1200, "sedan", "Barina");
        hdb.addCar(3800, "wagon", "Commodore");
        hdb.print();
    }
}