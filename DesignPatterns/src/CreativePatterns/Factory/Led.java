package CreativePatterns.Factory;

public class Led extends Tv{
    public Led(int inches) {
        super(inches);
    }
    
    @Override
    public String getDescription() {
        return "Led Tv";
    }
}
