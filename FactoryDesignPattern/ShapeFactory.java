package FactoryDesignPattern;

public class ShapeFactory {
  static Shape getShape(String input){
        
        switch (input) {
            case "Circle":
                 return new Circle();
            case "Rectangle":
                 return new Rectangle();
            default:
                break;
        }

    }
    
}
