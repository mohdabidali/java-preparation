package StrategyDesignPattern;

public class SportVehicle extends VehicleBase {
    SportVehicle(){
        super( new SportsDriveStrategy());
    }
    
}
