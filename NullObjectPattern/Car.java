package NullObjectPattern;

public class Car  implements Vehicle{
    @Override
    public int getCarTankCapacity(){
        return 50;
    }
    public int getSeatingCapacity(){
        return 10;
    }
    
}
