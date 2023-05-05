package StructuralPatterns.FlyWeight;

public class Employee implements Person {
    private String position;
    private String name;
    private double salary;
    
    public Employee(String position, String name, double salary) {
        this.position = position;
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public String information() {
        return "Position: " + position + "\nName: " + name + "\nSalary: " + salary;
    }
}
