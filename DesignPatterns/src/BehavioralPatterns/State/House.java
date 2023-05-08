package BehavioralPatterns.State;

public class House {
    private AlarmState alarm ;
    
    public void activateAlarm() {
        alarm = new Activated();
    }
    
    public void deactivateAlarm() {
        alarm = new Unactivated();
    }
    
    public void state() {
        alarm.alarm();
    }
}
