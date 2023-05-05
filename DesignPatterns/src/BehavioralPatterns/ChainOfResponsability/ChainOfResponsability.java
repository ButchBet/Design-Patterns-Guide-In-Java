package BehavioralPatterns.ChainOfResponsability;


public class ChainOfResponsability {
    public ChainOfResponsability(){}
    
    public void main() {
        Tourism tourism = new Tourism();
        
        tourism.assignGuide(8);
        tourism.assignGuide(15);
        tourism.assignGuide(50);
    }
}
