package StructuralPatterns.FlyWeight;

public class FlyWeightFactory {
    Employee employee;
    
    public void listEmployees(String positions[], String names[], double salaries[]) {
        for(int i = 0; i < positions.length; i++) {
            employee = new Employee(positions[i], names[i], salaries[i]);
            
            System.out.println("Employee's information:\n" + employee.information() + "\n");
        }
    }
}
