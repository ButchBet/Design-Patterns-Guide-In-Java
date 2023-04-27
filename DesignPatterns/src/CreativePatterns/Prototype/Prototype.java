package CreativePatterns.Prototype;

public class Prototype {
    public void main() throws CloneNotSupportedException {
        PcPrototype PcP = new PcPrototype();
        
        Pc pc = (Pc) PcP.prototype("Laptop");
        
        System.out.println("Laptop" + "\nCpu: " + pc.getCpu() + "\nInches: " + pc.getInches() + "\nCost: " + pc.getCost() + "\nMemory: " + pc.getMemory() + "\nWarranty: " + pc.getWarranty());
    }
}
