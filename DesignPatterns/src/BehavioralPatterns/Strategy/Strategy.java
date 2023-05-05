package BehavioralPatterns.Strategy;

public class Strategy {
    public Strategy() {}
    
    public void main() {
        Context cx = new Context();
        
        System.out.println(cx.operation(1, 2, '+'));
        System.out.println(cx.operation(-5, 5, '-'));
        System.out.println(cx.operation(8, 8, '*'));
        System.out.println(cx.operation(100, 100, '/'));
    }
}
