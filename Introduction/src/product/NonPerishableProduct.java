package product;

public class NonPerishableProduct extends Product {
    private String type; 
    
    public NonPerishableProduct(){}
    
    public NonPerishableProduct(String name, Double cost, String type) {
        super(name, cost);
        
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String toString() {
        return "Name: " + this.getName() + "\nCost: " + this.getCost() + "\nType: " + this.getType();
    }
    
    public double calculate(int quantity) {
        return quantity*this.getCost();
    }
}
