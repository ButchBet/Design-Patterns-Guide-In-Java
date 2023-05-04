package StructuralPatterns.Adapter;

public class ElectricEngineAdapter extends Engine {
    private ElectricEngine electricEngine;
    
    public ElectricEngineAdapter() {
        super();
        
        this.electricEngine = new ElectricEngine();
    }
    
    @Override
    public void turnOn() {
        System.out.println("Turning on electric engine.");
        
        electricEngine.connect();
        
        electricEngine.activate();
    }
    
    @Override
    public void speedUp() {
        System.out.println("Speeding up electric engine.");
        
        electricEngine.speedUp();
    }
    
    @Override 
    public void turnOff() {
        System.out.println("Turning off electric engine.");
        
        electricEngine.disconnect();
        
        electricEngine.stop();
        
        electricEngine.deactivate();
    }
}
