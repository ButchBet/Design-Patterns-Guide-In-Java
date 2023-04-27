package CreativePatterns.Prototype;

import java.util.HashMap;

public class PcPrototype {
    private HashMap<String, Pc> prototipes = new HashMap<String, Pc>();
    
    public PcPrototype() {
        Desktop desktop = new Desktop(18, "Core i-", 1300000, 100000);
        
        Laptop laptop = new Laptop(14, "Core i-3", 1200000, 500000, "1 year");
        
        prototipes.put("Desktop", desktop);
        prototipes.put("Laptop", laptop);
    }
    
    public Object prototype(String type) throws CloneNotSupportedException {
        return prototipes.get(type).clone();
    }
}
