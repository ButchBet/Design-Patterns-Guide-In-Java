package StructuralPatterns.FlyWeight;

public class FlyWeight {
    public FlyWeight() {}
    
    public void main() {
        FlyWeightFactory fw = new FlyWeightFactory();
        
        String position[] = {
            "Bilingual Agent",
            "Management student",
            "Medicine student",
            "Market store manager",
            "Sales assitant",
            "High school student",
            "Bilingual Agent",
            "I don't know what manaeger"
        };        
        
        String names[] = {
            "Kevin",
            "Kellys",
            "Karem",
            "Andrea",
            "Diana",
            "Taliana",
            "Dayana",
            "Luisa"
        };
        
        double salaries[] = {
            2596000,
            300000,
            300000,
            30000000,
            1160000,
            100000,
            1800000,
            2000000
            
        };
        
        fw.listEmployees(position, names, salaries);        
    }
}
