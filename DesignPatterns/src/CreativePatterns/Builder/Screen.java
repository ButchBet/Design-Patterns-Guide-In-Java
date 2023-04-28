package CreativePatterns.Builder;

public class Screen {
    private int inches;
    private String format;
    
    public Screen(int inches, String format) {
        this.inches = inches;
        this.format = format;
    }
    
    public int getInches() {
        return inches;
    }
    
    public String getFormat() {
        return format;
    }
}
