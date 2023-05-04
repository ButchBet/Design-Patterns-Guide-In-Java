package StructuralPatterns.Adapter;

public class commonEngine extends Engine{
    public commonEngine() {
        super();
        
        System.out.println("Creating common engine.");
    }
    
    @Override
    public void turnOn() {
        System.out.println("Turning on common engine.");
    }
    
    @Override
    public void speedUp() {
        System.out.println("Speeding up common engine.");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Turning off common engine.");
    }
}
