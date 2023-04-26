package CreativePatterns.Singleton;

public class Manager {
    private String name;

    // Create an object with the same class
    private static Manager manager;
    
    // Private builder, this avoids the creation of a default builder
    private Manager(String name) {
        this.name = name;
        
        System.out.println("Manager: " + this.name);
    }
    
    public static Manager getSingletonInstance(String name){
        if(manager == null) {
            manager = new Manager(name);
        } else {
            System.out.println("Unable to create a manager with name " + name + ", manager already exists.");
        }
        
        return manager;
    }
    
    public String getName() {
        return "Manager: " + name;
    }
    
}
