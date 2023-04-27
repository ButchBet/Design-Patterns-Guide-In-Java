package CreativePatterns.Factory;

public class TvFactory implements TvFactoryMethod {
    public Tv createTv(int inches) {
        if(inches < 20) {
            return new Lcd(inches);
        } else if(inches >= 20 && inches <= 35) {
            return new Led(inches);
        } else {
            return new Plasma(inches);
        }
    }
}
