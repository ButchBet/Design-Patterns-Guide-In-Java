package product;

public class PerishableProduct extends Product {
    private int daysToExpire;
    
    public PerishableProduct(){}
    
    public PerishableProduct(String name, double cost, int daysToExpire){
        super(name, cost);
        
        this.daysToExpire = daysToExpire; 
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    public void setDaysToExpire(int daysToExpire) {
        this.daysToExpire = daysToExpire;
    }
    
    public double calculate(int quantity) {
        /*
        We are calculaing the cost with the next form: quantity(cost - ((cost/30)*(30-daysToExpire))))
                                                              ^
                                                              |
                                                              The total to decrease in the cost
        
        We just do this when the days to expire are equal to 30, basically a month - 1
        */
        
        if(this.getDaysToExpire() < 30) {
          return quantity*(this.getCost() - ((this.getCost()/30)*(30-this.getDaysToExpire())));
        }
        
        return quantity*this.getCost();
    }
    
    public String toString() {
        return "Name: " + this.getName() + "\nCost: " + this.getCost() + "\nDays to expire: " + this.getDaysToExpire();
    }
}
