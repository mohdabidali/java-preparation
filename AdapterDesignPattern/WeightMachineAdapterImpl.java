package AdapterDesignPattern;

public class WeightMachineAdapterImpl {
    WeightMachine weightMachine;
    WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    public double getWeightInKg(){
        double weightInKg= weightMachine.getWeightInPound();
        return weightInKg* 0.45;
    }
}
