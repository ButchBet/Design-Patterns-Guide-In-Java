package CreativePatterns.Factory;

public class Factory {
    public void main() {
        TvFactoryMethod factory = new TvFactory();
        
        Tv tv1 = factory.createTv(32);
        Tv tv2 = factory.createTv(40);
        
        System.out.println("1. " + tv1.getDescription());
        System.out.println("2. " + tv2.getDescription());
    }
}
