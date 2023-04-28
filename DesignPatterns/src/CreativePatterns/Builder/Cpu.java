package CreativePatterns.Builder;

public class Cpu {
    private int cores;
    private double clock;
    private String make;

    public Cpu(int cores, double clock, String make) {
        this.cores = cores;
        this.clock = clock;
        this.make = make;
    }
    
    public int getCores() {
        return cores;
    }

    public double getClock() {
        return clock;
    }

    public String getMake() {
        return make;
    }
}
