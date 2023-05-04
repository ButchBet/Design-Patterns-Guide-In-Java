package StructuralPatterns.Decorator;

public class Mushrooms extends PizzaDecorator {
    private Ingredients ingredients;
    
    public Mushrooms(Ingredients ingredients) {
        super(ingredients);
        
        this.ingredients = ingredients;
    }
    
    public String getDescription() {
        return ingredients.getDescription();
    }
    
    public int getCost() {
        return ingredients.getCost() + 1000;
    }
}
