package CreativePatterns.Factory;

public abstract class Tv {
    private int inches;
    
    public Tv(int inches) {
        this.inches = inches;
    }
    
    public abstract String getDescription();
}
