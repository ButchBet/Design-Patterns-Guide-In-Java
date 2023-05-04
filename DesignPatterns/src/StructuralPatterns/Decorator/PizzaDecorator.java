package StructuralPatterns.Decorator;

public abstract class PizzaDecorator implements Ingredients {
    private Ingredients ingredients;
    
    public PizzaDecorator(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }   
}
