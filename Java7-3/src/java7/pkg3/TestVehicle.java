package java7.pkg3;
public class TestVehicle {
    public static void main(String[] args){
        
        Vehicle v1 = new Vehicle("Dogde");
        Vehicle v2 = new Vehicle("Edict");
        v2.setMake("SEER");
        Vehicle.Engine v3 = new Vehicle.Engine("Fortune");
      
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("Make by: " + Vehicle.Engine.getMake());
        System.out.println("Capacity: " + Vehicle.Engine.getCapacity());
        System.out.println(v3.getChassisNo());
        System.out.println(v3.getModel());
        System.out.println(v3.getClass());
    }
    
}
