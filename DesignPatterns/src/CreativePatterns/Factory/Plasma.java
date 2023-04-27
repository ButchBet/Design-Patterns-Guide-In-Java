package CreativePatterns.Factory;

public class Plasma extends Tv{
    public Plasma(int inches) {
        super(inches);
    }
    
    @Override
    public String getDescription() {
        return "Plasma Tv";
    }
}