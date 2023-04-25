package employee;

public class DeliveryEmployee extends Employee {
    private String zone;
    
    public DeliveryEmployee() {}
    
    public DeliveryEmployee(String name, int age, double salary, String zone) {
        super(name, age, salary);
        
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
    public void plus() {
        if(this.getAge() > 25 && this.getZone().equalsIgnoreCase("zone 3")) {
            this.setSalary(this.getSalary() + this.getPlus());
        }
    }
    
    public String toString() {
        return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nSalary: " + this.getSalary() + "\nZone: " + this.getZone();
    }
}
