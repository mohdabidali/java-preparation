package DecoratorDesignPattern;

public class ExtraChess extends ToppingDecorator {

    BasePizza pizza;
    ExtraChess(BasePizza pizza){
        this.pizza =pizza;
    
    }
    
    public int cost(){
        return this.pizza.cost() +50;
    }
}
