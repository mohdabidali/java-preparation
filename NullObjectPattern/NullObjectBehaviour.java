package NullObjectPattern;

public class NullObjectBehaviour  implements Vehicle{
    @Override
    public int getCarTankCapacity(){
        return 0;
    }
    public int getSeatingCapacity(){
        return 0;
    }
}
