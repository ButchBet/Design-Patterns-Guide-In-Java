package CreativePatterns.Builder;

public class Rom {
    private int capacity;
    private String type;
    
    public Rom(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }    
}
