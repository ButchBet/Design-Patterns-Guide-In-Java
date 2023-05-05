package BehavioralPatterns.Strategy;

public class Multiplication implements Calculator {
    @Override
    public double operation(double a, double b) {
        return a * b;
    }
}
