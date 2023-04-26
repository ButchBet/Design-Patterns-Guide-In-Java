package CreativePatterns.Singleton;

public class Singleton {
    public Singleton(){}
    
    public void main() {
        Manager Juan = Manager.getSingletonInstance("Juan Marin");
        Manager Maria = Manager.getSingletonInstance("Maria Gonzales");
        
        System.out.println(Juan.getName());
        System.out.println(Maria.getName());
    }
}
