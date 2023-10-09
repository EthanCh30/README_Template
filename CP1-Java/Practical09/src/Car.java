public class Car extends Vehicle {
    private String type;
    private String model;

    // Constructor
    public Car(int engineCapacity, String make, String type, String model) {
        super(engineCapacity, make); // Call to the constructor of the super class (Vehicle)
        this.type = type;
        this.model = model;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setEngineCapacity(int engineCapacity) {
        System.out.println("Cannot change the engine capacity of a car");
    }


    @Override
    public String toString() {
        return super.toString() + "\n  type = " + type + "\n  model = " + model;
    }

}

