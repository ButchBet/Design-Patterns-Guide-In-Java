package BehavioralPatterns.State;

public class Unactivated implements AlarmState {
    @Override
    public void alarm() {
        System.out.println("Unactivated alarm.");
    }
}
