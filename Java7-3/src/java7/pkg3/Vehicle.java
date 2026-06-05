package java7.pkg3;

public class Vehicle {
    public static String make = "Augur";
    public static int numVehicles = 0;
    private String ChassisNo;
    private String model;

    public static class Engine extends Vehicle{
        private static final String make = "Predicter";
        private static final int capacity = 1600; 

        public Engine(String model) {
            super(model);
        }
        
        public static String getMake() {
            return make;
        }

        public static int getCapacity() {
            return capacity;
        }
        
    }
    
    public Vehicle(String model) {
        this.model = model;
        numVehicles += 1;
        this.ChassisNo = "ch" + numVehicles;
        System.out.println("Vehicle manufactured");
    }

    public String getChassisNo() {
        return ChassisNo;
    }

    public void setChassisNo(String ChassisNo) {
        this.ChassisNo = ChassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void setMake(String make) {
        Vehicle.make = make;
    }
    
    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + make +
               "\nThe model type is " + Engine.capacity +
               "\nThe chassis number is " + ChassisNo;
}
    
    
    
}
