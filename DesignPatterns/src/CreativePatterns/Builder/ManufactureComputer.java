package CreativePatterns.Builder;

public class ManufactureComputer {
    private BuildComputer buildComputer;
    
    public void createComputer() {
        buildComputer.buildScreen();
        buildComputer.buildRom();
        buildComputer.buildCpu();
        buildComputer.buildMake();
    }

    public void setBuildComputer(BuildComputer bC) {
        this.buildComputer = bC;
    }
    
    public Computer getComputer() {
        return buildComputer.getComputer();
    }
}
