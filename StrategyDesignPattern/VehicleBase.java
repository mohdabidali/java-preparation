package StrategyDesignPattern;

public class VehicleBase {
    DriveStrategy driveStrategy;

    VehicleBase(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    
    public void drive(){
        driveStrategy.drive();
    }
}
