package StructuralPatterns.Adapter;

public class Adapter {
    public Adapter() {}
    
    public void main() {
        Engine engine1 = new EconomicEngine();
                
        Engine engine2 = new ElectricEngineAdapter();

        System.out.println("\n");

        engine1.turnOn();
        engine1.speedUp();
        engine1.turnOff();
        
        System.out.println("\n");
        
        engine2.turnOn();
        engine2.speedUp();
        engine2.turnOff();
    }
}
