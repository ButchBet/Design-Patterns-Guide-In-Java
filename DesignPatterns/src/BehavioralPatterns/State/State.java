package BehavioralPatterns.State;

public class State {
    public State() {}
    
    public void main() {
        Phone phone = new Phone("123");
        
        phone.activate();
        phone.state();
        phone.deactivate();
        phone.state();
        
        phone = new Phone("321");
        
        phone.activate();
        phone.state();
        phone.deactivate();
        phone.state();
    }
}
