package java7.pkg3;

public class Vehicle {
    public static String make = "Augur";
    public static int numVehicles = 0;
    private String ChassisNo;
    private String model;

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
    
    
    
}
