package NullObjectPattern;

public class Main {
    public static void main(String[] args) {
        
        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle);
    }

       private  static void printVehicleDetails(Vehicle object){
        System.out.println(object.getCarTankCapacity());
        System.out.println(object.getSeatingCapacity());
        }
    
}
