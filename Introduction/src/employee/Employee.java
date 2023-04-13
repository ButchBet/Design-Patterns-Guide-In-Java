package employee;

import person.Person;

public class Employee extends Person {
    private double salary;
    private final int plus = 300;
    
    protected Employee(){}
    
    protected Employee(String name, int age, double salary) {
        super(name, age);
        
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPlus() {
        return plus;
    }
}
