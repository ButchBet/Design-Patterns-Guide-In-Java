package BehavioralPatterns.Strategy;

public class Substraction implements Calculator {
    @Override
    public double operation(double a, double b) {
        return a - b;
    }
}
