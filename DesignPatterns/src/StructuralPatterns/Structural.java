package StructuralPatterns;

import CreativePatterns.Builder.Builder;
import CreativePatterns.Factory.Factory;
import CreativePatterns.Prototype.Prototype;
import CreativePatterns.Singleton.Singleton;
import StructuralPatterns.Adapter.Adapter;
import StructuralPatterns.Decorator.Decorator;
import StructuralPatterns.Facade.Facade;
import StructuralPatterns.FlyWeight.FlyWeight;
import java.util.Scanner;

public class Structural {
    public Structural() {}
    
    static Scanner cmd = new Scanner(System.in);
    
    public void main() throws CloneNotSupportedException {
        char op = ' ';
        
        do {      
            System.out.println("");
            
            // Show possible options
            System.out.println("What do you want to prove?.");
            
            System.out.println("1: Adapter.");
            
            System.out.println("2. Decorator.");
            
            System.out.println("3. Facade.");
            
            System.out.println("4. Flyweight.");
            
            System.out.println("Other. Get back.");
            
            String proveOp = cmd.nextLine();
            
            if(proveOp.length() == 1) {
                op = proveOp.charAt(0);
            } else {
                op = 'e';                
            }
            
            rooter(op);
        } while(op == '1' || op == '2' || op == '3' || op == '4');
    }
    
    public void rooter(char op) throws CloneNotSupportedException{
        System.out.println("");
        switch(op){
            case '1':
                Adapter adapter = new Adapter();
                
                adapter.main();
                break;
            case '2':
                Decorator decorator = new Decorator();
                
                decorator.main();
                break;
            case '3':
                Facade facade = new Facade();
                
                facade.main();
                break;
            case '4':
                FlyWeight flyweight = new FlyWeight();
                
                flyweight.main();
                break;
            default:
                System.out.println("Getting back...");
                break;
        }
    }
}
