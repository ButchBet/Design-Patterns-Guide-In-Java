package StructuralPatterns.FlyWeight;

public class FlyWeightFactory {
    Employee employee;
    
    public void listEmployees(String position[], String name[], double salary[]) {
        for(int i = 0; i < position.length; i++) {
            employee = new Employee(position[i], name[i], salary[i]);
            
            System.out.println("Employee's information:\n" + employee.information() + "\n");
        }
    }
}
