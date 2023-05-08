package BehavioralPatterns.State;

public class Activated implements AlarmState {
    @Override 
    public void alarm() {
        System.out.println("Activated alarm.");
    }
}
