package employee;

public class CommercialEmployee extends Employee {
    private double commission;
    
    public CommercialEmployee(){}
    
    public CommercialEmployee(String name, int age, double salary, double commission) {
        super(name, age, salary);
        
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    public void plus() {
        if(this.getAge() > 30 && this.commission > 200) {
            this.setSalary(this.getSalary() + this.getPlus());
        }
    }
}
