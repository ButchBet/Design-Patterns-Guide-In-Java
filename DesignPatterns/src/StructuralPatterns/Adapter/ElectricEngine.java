package StructuralPatterns.Adapter;

public class ElectricEngine {
    private boolean connected = false; 
    public ElectricEngine() {
        this.connected = false;
       
        System.out.println("Creating electic engine.");
    }
    
    public void connect() {
        System.out.println("Connecting electric engine.");
        
        this.connected = true;
    }
    
    public void activate() {
        if(!connected) {
            System.out.println("We cannot activate because the electric engine is not connected.");
        } else {
            System.out.println("Electric engine connected, activating engine.");
        }
    }
    
    public void speedUp() {
        if(!connected) {
            System.out.println("We cannon speed up because the electric engine is not connected.");
        } else {
            System.out.println("Electric engine connected, increasing engine voltage..");
        }
    }
    
    public void stop() {
        if(!connected) {
            System.out.println("We cannot stop the electric engine because engine is not connected.");
        } else {
            System.out.println("Stoping electric engine.");
        }
    }
    
    public void disconnect() {
        System.out.println("Disconnecting electric engine.");
        
        this.connected = false;
    }
}
