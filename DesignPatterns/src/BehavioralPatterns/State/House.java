package BehavioralPatterns.State;

public class House {
    private AlarmState alarm ;
    
    public void activate() {
        alarm = new Activated();
    }
    
    public void unactivate() {
        alarm = new Unactivated();
    }
    
    public void state() {
        alarm.alarm();
    }
}
