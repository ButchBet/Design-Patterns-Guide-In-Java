package CreativePatterns.Builder;

public class Builder {
    public void main() {
        ManufactureComputer mC = new ManufactureComputer();
        
        mC.setBuildComputer(new Make1());
        
        mC.createComputer();
        
        Computer pc = mC.getComputer();
        
        System.out.println("Make: " + pc.getMake());
        System.out.println("\nScreen --> " + "Inches: " + pc.getScreen().getInches() + ", Format: " + pc.getScreen().getFormat());
        System.out.println("\nRom --> " + "Capacity: " + pc.getRom().getCapacity() + ", Type: " + pc.getRom().getType());
        System.out.println("\nCpu --> " + "Cores: " + pc.getCpu().getCores() + ", Clock: " + pc.getCpu().getClock() + ", Make: " + pc.getCpu().getMake());
    }
}
