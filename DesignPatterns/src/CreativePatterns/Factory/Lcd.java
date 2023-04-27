package CreativePatterns.Factory;

public class Lcd extends Tv{
    public Lcd(int inches) {
        super(inches);
    }
    
    @Override
    public String getDescription() {
        return "Lcd Tv";
    }
}
