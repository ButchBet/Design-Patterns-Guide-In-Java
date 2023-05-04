package StructuralPatterns.Decorator;

public class Decorator {
    public Decorator(){}
    
    public void main() {
        Ingredients pizza = new Pizza();
        
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());
        
        pizza = new Pineapple(pizza);
        
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());
        
        pizza = new Mushrooms(pizza);
        
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());
        
        pizza = new Sauce(pizza);
        
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());
    }
}
