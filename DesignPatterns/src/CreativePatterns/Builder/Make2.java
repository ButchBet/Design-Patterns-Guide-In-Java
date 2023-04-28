package CreativePatterns.Builder;

public class Make2 extends BuildComputer {
    @Override
    public void buildScreen() {
        Screen screen = new Screen(24, "LED");
        
        this.computer.setScreen(screen);
    }
    
    @Override
    public void buildRom() {
        Rom rom = new Rom(1000, "HDD");
        
       this.computer.setRom(rom);
    }
    
    @Override
    public void buildCpu() {
        Cpu cpu = new Cpu(8, 2.4, "AMD");
        
        this.computer.setCpu(cpu);
    }
    
    @Override
    public void buildMake() {
        this.computer.setMake("Make2");
    }
}
