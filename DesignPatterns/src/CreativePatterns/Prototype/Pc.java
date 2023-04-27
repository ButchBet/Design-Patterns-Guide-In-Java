package CreativePatterns.Prototype;

public abstract class Pc implements Cloneable {
    private int inches;
    private String cpu;
    private double cost;
    private int memory ;
    private String warranty;

    public Pc(int inches, String cpu, double cost, int memory, String warranty) {
        this.inches = inches;
        this.cpu = cpu;
        this.cost = cost;
        this.memory = memory;
        this.warranty = warranty;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getInches() {
        return inches;
    }

    public String getCpu() {
        return cpu;
    }

    public double getCost() {
        return cost;
    }

    public int getMemory() {
        return memory;
    }
    
    public String getWarranty() {
        return warranty;
    }
}
