package java7.pkg3;
public class TestVehicle {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Dogde");
        System.out.println("Manufacturer: " + Vehicle.make);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
        System.out.println("Chassis Number: " + v1.getChassisNo());
        System.out.println("Model: " + v1.getModel());
        Vehicle v2 = new Vehicle("Edict");
        v2.setMake("SEER");
        System.out.println("Manufacturer: " + Vehicle.make);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
        System.out.println("Chassis Number: " + v2.getChassisNo());
        System.out.println("Model: " + v2.getModel());
        
        System.out.println(v1);
        System.out.println(v2);
    }
    
}
