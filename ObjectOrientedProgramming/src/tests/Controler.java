package tests;

public class Controler {    
    public static void singletn() {
        Manager Juan = Manager.getSingletonInstance("Juan Marin");
        System.out.println(Juan.getName());
        Manager Maria = Manager.getSingletonInstance("Maria Gonzales");
        System.out.println(Maria.getName());
    }
}
