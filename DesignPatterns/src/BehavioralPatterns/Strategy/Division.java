package BehavioralPatterns.Strategy;

public class Division implements Calculator {
    @Override
    public double operation(double a, double b) {
        return a / b;
    }
}
