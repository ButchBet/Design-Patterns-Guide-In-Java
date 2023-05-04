package StructuralPatterns.Decorator;

public class Sauce extends PizzaDecorator {
    private Ingredients ingredients;
    
    public Sauce(Ingredients ingredients) {
        super(ingredients);
        
        this.ingredients = ingredients;
    }
    
    public String getDescription() {
        return ingredients.getDescription() + " + Sauce";
    }
    
    public int getCost() {
        return ingredients.getCost() + 800;
    }
}
