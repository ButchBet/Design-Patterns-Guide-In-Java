package CreativePatterns.Builder;

public abstract class BuildComputer {
    protected Computer computer;
    
    public BuildComputer() {
        this.computer = new Computer();
    }
    
    public Computer getComputer() {
        return computer;
    }
    
    public abstract void buildScreen();
    public abstract void buildRom();
    public abstract void buildCpu();
    public abstract void buildMake();
}
