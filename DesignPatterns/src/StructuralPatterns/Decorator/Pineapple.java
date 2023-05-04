package StructuralPatterns.Decorator;

public class Pineapple extends PizzaDecorator {
    private Ingredients ingredients;
    
    public Pineapple(Ingredients ingredients) {
        super(ingredients); 
        
        this.ingredients = ingredients;
    }
    
    public String getDescription() {
        return ingredients.getDescription() + " + Pineappel";
    }
    
    public int getCost() {
        return ingredients.getCost() + 500;
    }
}
