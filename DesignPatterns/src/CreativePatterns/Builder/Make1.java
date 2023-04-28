package CreativePatterns.Builder;

public class Make1 extends BuildComputer {
    @Override
    public void buildScreen() {
        Screen screen = new Screen(21, "HD");
        
        this.computer.setScreen(screen);
    }
    
    @Override
    public void buildRom() {
        Rom rom = new Rom(500, "SSD");
        
        this.computer.setRom(rom);
    }
    
    @Override
    public void buildCpu() {
        Cpu cpu = new Cpu(4, 2.1, "Intel");
        
        this.computer.setCpu(cpu);
    }
    
    @Override
    public void buildMake() {
        this.computer.setMake("Make1");
    }
}
