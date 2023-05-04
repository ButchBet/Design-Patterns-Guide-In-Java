package StructuralPatterns.Decorator;

public class Pizza implements Ingredients {
    public String getDescription() {
        return "cheese + Mortadella";
    }
    
    public int getCost() {
        return 3000;
    }
}
