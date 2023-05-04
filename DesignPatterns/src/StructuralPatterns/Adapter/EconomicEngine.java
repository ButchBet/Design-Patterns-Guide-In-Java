package StructuralPatterns.Adapter;

public class EconomicEngine extends Engine {
    public EconomicEngine() {
        super();
        
        System.out.println("Creating economic engine.");
    }
    
    @Override 
    public void turnOn() {
        System.out.println("Turning on economic engine.");
    }
    
    @Override
    public void speedUp() {
        System.out.println("Speeding up economic engine.");
    }
    
    @Override 
    public void turnOff() {
        System.out.println("Turning off economic engine.");
    }
}
