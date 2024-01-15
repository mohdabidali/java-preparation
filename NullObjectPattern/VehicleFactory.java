package NullObjectPattern;

public class VehicleFactory {
    
    static Vehicle getVehicleObject(String name){
        if("Car".equals(name)){
            return new Car();
        }
        return new NullObjectBehaviour();
    }
}
