package DecoratorDesignPattern;

public class Mushroom extends ToppingDecorator {
    BasePizza pizza;
    Mushroom(BasePizza pizza){
        this.pizza =pizza;
    
    }
    
    public int cost(){
        return this.pizza.cost() +70;
    }
}
