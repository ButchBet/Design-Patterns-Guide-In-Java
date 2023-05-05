package BehavioralPatterns.Strategy;

public class Context {
    public double operation(double a, double b, char operation) {
        Calculator calculator = null;
        
        switch(operation) {
            case '+':
                calculator = new Addition();
                break;
            case '-':
                calculator = new Substraction();
                break;
            case '*':
                calculator = new Multiplication();
                break;
            case '/':
                calculator = new Division();
                break;
            default:
                System.out.println("This is not an operation.");
        }
        
        return calculator.operation(a, b);
    }
}
