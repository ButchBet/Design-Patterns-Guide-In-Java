package CreativePatterns.Builder;

public class Computer {
    private String make;
    private Screen screen;
    private Rom rom;
    private Cpu cpu;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Rom getRom() {
        return rom;
    }

    public void setRom(Rom rom) {
        this.rom = rom;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
